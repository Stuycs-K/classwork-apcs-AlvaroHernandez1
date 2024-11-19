import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day2 {
  public static void main(String[] args) {
    System.out.println(code("input.txt"));
  }

  public static String code(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      int x = 0;
      int y = 0;
      //CODE THAT SCANS THE FILE.
      String pin = "";
      int current = 5;
      while (input.hasNextLine()){
        String line = input.nextLine();
        for (int i = 0; i < line.length(); i++){
            if ((line.charAt(i) == 'D') && ((current == 1) || (current == 11)))
                current += 2;
            else if ((line.charAt(i) == 'D') && ((current == 2) || (current == 3) || (current == 4) || (current == 6) || (current == 7) || (current == 8)))
                current += 4;
            if ((line.charAt(i) == 'U') && ((current == 3) || (current == 13)))
                current -= 2;
            else if ((line.charAt(i) == 'U') && ((current == 10) || (current == 11) || (current == 12) || (current == 6) || (current == 7) || (current == 8)))
                current -= 4;
           
            if ((line.charAt(i) == 'R') && (current != 1) && (current != 4) && (current != 9) && (current != 12) && (current != 13))
                current += 1;
            if ((line.charAt(i) == 'L') && (current != 1) && (current != 2) && (current != 5) && (current != 10) && (current != 13))
                current -= 1;
        }
        pin += current + " ";
      }

      input.close();//releases the file from your program

      return (pin);

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return null; //you can return from a void function just don't put a value.
    }
  }
}
