public class MyArrays{
  public static void main(String[] args){
    // tests aryToString
    System.out.println("Expected: [1, 2, 3, 4, 5, 6, 0, 2147483647] Received: " + aryToString(new int[] {1, 2, 3, 4, 5, 6, 0, 2147483647}));
    System.out.println("Expected: [-2147483646 , -10, 0, -3] Received: " + aryToString(new int[] {-2147483646 , -10, 0, -3}));
    System.out.println("Expected: [0, 0, 0, 0, 0, 0] Received: " + aryToString(new int[6]));
    System.out.println("Expected: [] Received: " + aryToString(new int[0]));
    System.out.println();
    // tests returnCopy
    int[] ary = {-100 ,1, 2, 3, 4, 5, 6, 0, 2147483647};

    System.out.println("Expected: " + aryToString(ary) + " Received: " + aryToString(returnCopy(ary)));
    System.out.println("Address 1: " + ary + " Address 2: " + returnCopy(ary));
    System.out.println();
    // tests concatArray
    int[] ary1 = {1, 2, 3};
    int[] ary2 = {4, 5, 6, 7};
    String str1 =  (aryToString(ary1)).substring(0, (aryToString(ary1)).length() - 1);
    String str2 =  (aryToString(ary2)).substring(1);
    
    System.out.println("Expected: " + str1 + ", " + str2 + " Received: " + aryToString(concatArray(ary1, ary2)));
  }

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

  public static int[] returnCopy(int[] ary){
    int[] result = new int[ary.length];
    for(int i = 0; i < ary.length; i++)
    {
      result[i] = ary[i];
    }
    return result;
  }

  public static int[] concatArray(int[]ary1,int[]ary2){
    int[] result = new int[ary1.length + ary2.length];
    int indexResult = 0;
    for (int i = 0; i < ary1.length; i++)
    {
      result[indexResult] = ary1[i];
      indexResult++;
    }
        for (int i = 0; i < ary2.length; i++)
    {
      result[indexResult] = ary2[i];
      indexResult++;
    }
    return result;
  }
  
}
