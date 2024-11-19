import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day8 {
  public static void main(String[] args) {
    System.out.println(code("input.txt"));
  }

  public static int code(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      //The screen is 50 pixels wide and 6 pixels tall
      boolean[] lights = new boolean[300];
      
      while (input.hasNext()){
        String line = input.next();

        
      }
      input.close();//releases the file from your program

      return 0;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 0; //you can return from a void function just don't put a value.
    }
  }

    public static int count(String line){
        int count = 0;
        for (int i = 0; i < line.length(); i++){
            if (line.charAt(i) == '[')
                count++;
        }
        return count;
    }
}