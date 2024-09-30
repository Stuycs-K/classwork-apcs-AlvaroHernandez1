public class ArrayMethods{
// Alvaro Hernandez Jenaro - Alvaroh8@nycstudents.net
// Sandra Gao sandrag44@nycstudents.net

  public static void main(String[] args) {
    int[][] test = {{0, 1, 8 ,9}, {0, 0, 9}, {}};
    System.out.println(arrToString(test));

    test = new int[][] {{},{},{}};
    System.out.println(arrToString(test));
  }

  public static String arrToString(int[] nums){
    if (nums.length == 0)
      return "[]";
    String result = "[";
    for (int i = 0; i < nums.length - 1; i++)
    {
      result += nums[i] + ", ";
    }
    return result + nums[nums.length - 1] + "]";
  }

  public static String arrToString(int[][] nums){
      String result = "[";
      for (int i = 0; i < nums.length; i++)
      {
        result += arrToString(nums[i]);

        if (i < nums.length - 1) {
          result += ", ";
        }
      }
      return result + "]";
  }

  public static int arr2DSum (int [][] nums) {
    int total = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int n = 0; n < nums[i].length; n++) {
        total += nums[i][n];
      }
    }

    return total;
  }
}
