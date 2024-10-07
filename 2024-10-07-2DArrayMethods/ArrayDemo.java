import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[] test;
    int[][] test2D;
    System.out.println("________________Compare Arrays.toString() and arrToString()__________________");
    System.out.println();
    test = new int[] {1, 2, -3, 5, 6, 7};
    System.out.println("Expected: " + Arrays.toString(test) + ", Received: " + arrToString(test));
    System.out.println();
    System.out.println("________________Tests countZeros2D()__________________");
    test2D = new int[][] {{0}, {2, 3}, {0, -5, 6, 0}};
    System.out.println();
    System.out.println("Expected: 3, Received: " + countZeros2D(test2D));
    test2D = new int[][] {{1}, {2, 3}, {3, -5, 6, 7}};
    System.out.println("Expected: 0, Received: " + countZeros2D(test2D));
    System.out.println();
    System.out.println("________________Tests arr2DSum()__________________");
    test2D = new int[][] {{0}, {2, 3}, {0, -5, 6, 0}};
    System.out.println();
    System.out.println("Expected: 6, Received: " + arr2DSum(test2D));
    test2D = new int[][] {{1}, {2, 3}, {3, -5, 6, 7}};
    System.out.println("Expected: 17, Received: " + arr2DSum(test2D));
    System.out.println();
    System.out.println("-----------Tests replaceNegative()-----------");
    System.out.println();
	  test2D = new int[][] {{0, 0, 3, 1}, {1, -10, 20, 4, -5}, {-4, -6, 9}};
	  System.out.println("Expected [[0, 0, 3, 1], [1, 1, 20, 4, 0], [0, 0, 9]], Received: " + Arrays.deepToString(replaceNegative(test2D)));
    System.out.println();
    System.out.println("-----------Tests copy()-----------");
    System.out.println();
	  test2D = new int[][] {{0, 0, 3, 1}, {1, -10, 20, 4, -5}, {-4, -6, 9}};
    int[][] test2DCopy = copy(test2D);
	  System.out.println("Expected [[0, 0, 3, 1], [1, -10, 20, 4, -5], [-4, -6, 9]], Received: " + Arrays.deepToString(test2DCopy));
    test2D[0][0] = 100;
    System.out.println("Changed Original: " + Arrays.deepToString(test2D) + ", Copy: " + Arrays.deepToString(test2DCopy));
    System.out.println();
    System.out.println("-----------testing swapRC()-----------");
    System.out.println();
    test2D = new int[][] {{1, 2},{1, 2},{5, 6}};
    System.out.println("Expected: [[1, 1, 5], [2, 2, 6]], Received: " + Arrays.deepToString(swapRC(test2D)));
    test2D = new int[][] {{1, -2},{-1, 2},{3, 11}};
    System.out.println("Expected: [[1, -1, 3], [-2, 2, 11]], Received: " + Arrays.deepToString(swapRC(test2D)));
    System.out.println();
    System.out.println("-----------testing htmlTable()-----------");
    System.out.println();
    test2D = new int[][]{{1,2},{3}};
    System.out.println("Expected: <table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>, Received: " + htmlTable(test2D));
    System.out.println();

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    if (ary.length == 0)
      return "[]";
    String result = "[";
    for (int i = 0; i < ary.length - 1; i++)
    {
      result += ary[i] + ", ";
    }
    return result + ary[ary.length - 1] + "]";
  }

  public static String arrToString(int[][]ary){
    String result = "[";
    for (int i = 0; i < ary.length; i++)
    {
      result += arrToString(ary[i]);

      if (i < ary.length - 1) {
        result += ", ";
      }
    }
    return result + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++)
    {
      for (int n = 0; n < nums[i].length; n++)
      {
        if (nums[i][n] == 0)
          count++;
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++)
    {
      for (int n = 0; n < nums[i].length; n++)
      {
          sum += nums[i][n];
      }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  public static int[][] replaceNegative(int[][] vals){
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

  //4. Make a copy of the given 2d array.
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

  //5. Rotate an array by returning a new array with the rows and columns swapped.
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

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for (int i = 0; i < nums.length; i++)
    {
      result += "<tr>";
      for (int n = 0; n < nums[i].length; n++)
      {
        result += "<td>" + nums[i][n] + "</td>";
      }
      result += "</tr>";
    }
    return result + "</table>";
  }
}
