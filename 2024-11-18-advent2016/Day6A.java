import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day6A {
  public static void main(String[] args) {
    System.out.println(code("input.txt"));
  }

  public static int code(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      String column0 = "";
      String column1 = "";
      String column2 = "";
      String column3 = "";
      String column4 = "";
      String column5 = "";
      String column6 = "";
      String column7 = "";

      while (input.hasNext()){
        String line = input.next();

        column0 += line.charAt(0);
        char c1 = line.charAt(1);
        char c2 = line.charAt(2);
        char c3 = line.charAt(3);
        char c4 = line.charAt(4);
        char c5 = line.charAt(5);
        char c6 = line.charAt(6);
        char c7 = line.charAt(7);



      }
      input.close();//releases the file from your program
      System.out.println(column0);
      return 0;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 0; //you can return from a void function just don't put a value.
    }
  }
}
