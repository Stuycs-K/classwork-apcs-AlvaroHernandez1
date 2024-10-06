public class ArrayMethods{
// Alvaro Hernandez Jenaro - Alvaroh8@nycstudents.net
// Sandra Gao sandrag44@nycstudents.net

  public static void main(String[] args) {
    System.out.println();
    System.out.println( "-----------testing arrtoString() and arr2DSum()-----------");
    int[][] test = {{0, 1, 8 ,9}, {0, 0, 9}, {}};
    System.out.println("Expected: [[0, 1, 8, 9], [0, 0, 9], []], Received: " + arrToString(test));
    System.out.println("Expected: 27, Received: " + arr2DSum(test));

    test = new int[][] {{},{},{}};
    System.out.println("Expected: [[], [], []], Received: " + arrToString(test));
    System.out.println("Expected: 0, Received: " + arr2DSum(test));

    test = new int[][] {{-10, -2, -10},{22},{-17, 1}};
    System.out.println("Expected: [[-10, -2, -10], [22], [-17, 1]], Received: " + arrToString(test));
    System.out.println("Expected: -16, Received: " + arr2DSum(test));

    System.out.println("-----------testing swapRC()-----------");
    test = new int[][] {{1, 2},{1, 2},{5, 6}};
    System.out.println("Expected: [[1, 1, 5], [2, 2, 6]], Received: " + arrToString(swapRC(test)));
    test = new int[][] {{1, -2},{-1, 2},{3, 11}};
    System.out.println("Expected: [[1, -1, 3], [-2, 2, 11]], Received: " + arrToString(swapRC(test)));

    System.out.println("-----------testing replaceNegative()-----------");
	  test = new int[][] {{0, 0, 3, 1}, {1, -10, 20, 4, -5}, {-4, -6, 9}};
	  System.out.println("Expected [[0, 0, 3, 1], [1, 1, 20, 4, 0], [0, 0, 9]], Received: " + arrToString(replaceNegative(test)));

    System.out.println("-----------testing copy()-----------");
	  test = new int[][] {{0, 0, 3, 1}, {1, -10, 20, 4, -5}, {-4, -6, 9}};
    int[][] testCopy = copy(test);
	  System.out.println("Expected [[0, 0, 3, 1], [1, -10, 20, 4, -5], [-4, -6, 9]], Received: " + arrToString(testCopy));
    test[0][0] = 100;
    System.out.println("Changed Original: " + arrToString(test) + ", Copy: " + arrToString(testCopy));
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

  public static int[][] replaceNegative(int[][] vals) {
  for (int i = 0; i < vals.length; i ++)
	{
 		for (int n = 0; n < vals[i].length; n++)
 		{
 			if (vals[i][n] < 0 && i == n)
 				vals[i][n] = 1;
 			if (vals[i][n] < 0)
 				vals[i][n] = 0;
 		}
 	}
  return vals;
 }

public static int[][] copy(int[][] nums){
  int[][] result = new int[nums.length][];
  for (int i = 0; i < nums.length; i++)
  {
    result[i] = copy(nums[i]);
  }
  return result;
}

public static int[] copy(int[] nums){
  int[] result = new int[nums.length];
  for (int i = 0; i < nums.length; i++)
  {
    result[i] = nums[i];
  }
  return result;
}
}
