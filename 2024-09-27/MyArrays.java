public class MyArrays{
  public static void main(String[] args){
    // tests aryToString
    System.out.println("Expected: [1, 2, 3, 4, 5, 6, 0, 2147483647] Received: " + aryToString(new int[] {1, 2, 3, 4, 5, 6, 0, 2147483647}));
    System.out.println("Expected: [-2147483648 , -10, 0, -3] Received: " + aryToString(new int[] {-2147483648 , -10, 0, -3}));
    System.out.println("Expected: [0, 0, 0, 0, 0, 0] Received: " + aryToString(new int[6]));
    System.out.println("Expected: [] Received: " + aryToString(new int[0]));
    System.out.println();

    // tests returnCopy

    int[] aryCopy1 = {-100 ,1, 2, 3, 4, 5, 6, 0, 2147483647};
    System.out.println("Expected: " + aryToString(aryCopy1) + " Received: " + aryToString(returnCopy(aryCopy1)));
    System.out.println("Address 1: " + aryCopy1 + " Address 2: " + returnCopy(aryCopy1));
    int[] aryCopy2 = {-2147483648 ,0, -3, 03, 2147483647};
    System.out.println("Expected: " + aryToString(aryCopy2) + " Received: " + aryToString(returnCopy(aryCopy2)));
    System.out.println("Address 1: " + aryCopy2 + " Address 2: " + returnCopy(aryCopy2));
    int[] aryCopy3 = {};
    System.out.println("Expected: " + aryToString(aryCopy3) + " Received: " + aryToString(returnCopy(aryCopy3)));
    System.out.println("Address 1: " + aryCopy3 + " Address 2: " + returnCopy(aryCopy3));
    System.out.println();

    // tests concatArray

    int[] aryConcat1 = {1, -0200, 3};
    int[] aryConcat2 = {4, 5, -6, 7};
    String str1 =  (aryToString(aryConcat1)).substring(0, (aryToString(aryConcat1)).length() - 1);
    String str2 =  (aryToString(aryConcat2)).substring(1);
    System.out.println("Expected: " + str1 + ", " + str2 + " Received: " + aryToString(concatArray(aryConcat1, aryConcat2)));

    int[] aryConcat3 = {-2147483648};
    int[] aryConcat4 = {2147483647};
    str1 =  (aryToString(aryConcat3)).substring(0, (aryToString(aryConcat3)).length() - 1);
    str2 =  (aryToString(aryConcat4)).substring(1);
    System.out.println("Expected: " + str1 + ", " + str2 + " Received: " + aryToString(concatArray(aryConcat3, aryConcat4)));
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
