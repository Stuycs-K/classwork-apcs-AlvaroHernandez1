import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day4B {
  public static void main(String[] args) {
    System.out.println(code("input.txt"));
  }

  public static int code(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      while (input.hasNextLine()){
        String origLine = input.nextLine();
        String line = origLine.substring(0,origLine.length() - 12);
        int sector = Integer.parseInt(origLine.substring(origLine.length() - 10, origLine.length() - 7));
        int shift = sector % 26;
        String result = "";

        for (int i = 0; i < line.length(); i ++){
          if (line.charAt(i) > 96){
            if ((line.charAt(i) + shift) > 122)
              result += (char) (line.charAt(i) + shift - 26);
            else
              result += (char) (line.charAt(i) + shift);
          }

        }
        System.out.println(result);
      }
      input.close();//releases the file from your program

      return 0;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 0; //you can return from a void function just don't put a value.
    }
  }
}
