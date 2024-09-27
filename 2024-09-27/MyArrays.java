public class MyArrays{
  public static void main(String[] args){
    System.out.println("Expected: [1, 2, 3, 4, 5, 6, 0, 2147483647] Received: " + aryToString(new int[] {1, 2, 3, 4, 5, 6, 0, 2147483647}));
    System.out.println("Expected: [-2147483646 , -10, 0, -3] Received: " + aryToString(new int[] {-2147483646 , -10, 0, -3}));
    System.out.println("Expected: [0, 0, 0, 0, 0, 0] Received: " + aryToString(new int[6]));
  }

  public static String aryToString(int[] nums){
    String result = "[";
    for (int i = 0; i < nums.length - 1; i++)
    {
      result += nums[i] + ", ";
    }
    return result + nums[nums.length - 1] + "]";
  }


}
