//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
  public static void main(String[] args) {
    System.out.println(blocksTo("input.txt"));
  }

  public static int blocksTo(String filename){
    //2 Opening a file requires a try/catch
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      String total = input.nextLine();
      int x = 0;
      int y = 0;
      int direction = 0; // 0 = north, 1 = east, 2 = south, 3 = west
      int distanceTo = 0;
      String[] directions = total.split(", ");
      System.out.println(directions.length);
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
        if (direction == 1 || direction = 3){
          
        }

      }


      input.close();//releases the file from your program
      return distanceTo;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 0; //you can return from a void function just don't put a value.
    }
  }
}
