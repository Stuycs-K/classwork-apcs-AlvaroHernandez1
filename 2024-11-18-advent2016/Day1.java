//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day1 {
  public static void main(String[] args) {
    int[] a = {3, 2, 2, 4, 5};
    System.out.println(blocksTo("input.txt"));
  }

  public static String blocksTo(String filename){
    //2 Opening a file requires a try/catch
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      int x = 0;
      int y = 0;
      //CODE THAT SCANS THE FILE.
      String total = input.nextLine();
      int direction = 0; // 0 = north, 1 = east, 2 = south, 3 = west
      String[] directions = total.split(", ");
      int[] xArr = new int[directions.length];
      int[] yArr = new int[directions.length];
      String[] points = new String[directions.length];
      for (int i = 0; i < directions.length; i++){
        if (directions[i].substring(0,1).equals("R")){
          if (direction < 3)
            direction++;
          else
            direction = 0;
        }
        else{
          if (direction > 0)
            direction--;
          else
            direction = 3;
        }
        if (direction == 1)
          x += Integer.parseInt(directions[i].substring(1));
        if (direction == 2)
          y -= Integer.parseInt(directions[i].substring(1));
        if (direction == 3)
          x -= Integer.parseInt(directions[i].substring(1));
        if (direction == 0)
          y += Integer.parseInt(directions[i].substring(1));
        points[i] = "(" + x + ", " + y + ")";
        for (int index = 0; index < i - 1; index++){
          if (points[index].equals(points[i])){
            System.out.println(i);
            return points[i];
          }
        }
      }


      input.close();//releases the file from your program
      System.out.println(Arrays.toString(points));
      return "Hey";

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return "Hey"; //you can return from a void function just don't put a value.
    }
  }

  public static int indexOf(int num, int[] nums){
    for (int i = 0; i < nums.length; i++){
      if (nums[i] == num){
        return i;
      }
    }
    return -1;
  }
}
