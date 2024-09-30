public class ArrayMethods{
// Alvaro Hernandez Jenaro - Alvaroh8@nycstudents.net
// Sandra Gao sandrag44@nycstudents.net

  public static void main(String[] args) {
    // Tests both arrToString and arr2DSum
    int[][] test = {{0, 1, 8 ,9}, {0, 0, 9}, {}};
    System.out.println(arrToString(test));
    System.out.println(arr2DSum(test));

    test = new int[][] {{},{},{}};
    System.out.println(arrToString(test));
    System.out.println(arr2DSum(test));

    test = new int[][] {{-10, -2, -10},{22},{-17, 1}};
    System.out.println(arrToString(test));
    System.out.println(arr2DSum(test));

    // Tests swapRC
    test = new int[][] {{1, 2},{1, 2},{5, 6}};
    System.out.println(arrToString(swapRC(test)));
    test = new int[][] {{1, -2},{-1, 2},{3, 11}};
    System.out.println(arrToString(swapRC(test)));
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

  public static int[][] swapRC (int [][] nums) {
    int[][] column = new int[nums[0].length][nums.length];
    for (int n = 0; n < nums[n].length; n++)
    {
      for (int i = 0; i < nums.length; i++)
      {
        column[n][i] = nums[i][n]; 
      }
    }
    return column;
  }
}
