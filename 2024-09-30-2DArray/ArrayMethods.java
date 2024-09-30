public class ArrayMethods{
// Alvaro Hernandez Jenaro - Alvaroh8@nycstudents.net
// Sandra Gao sandrag44@nycstudents.net

  public static String aryToString(int[] nums){
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
      
  }
}
