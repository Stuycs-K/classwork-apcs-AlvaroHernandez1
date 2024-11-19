import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day2 {
  public static void main(String[] args) {
    System.out.println(code("input.txt"));
  }

  public static int code(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      int x = 0;
      int y = 0;
      //CODE THAT SCANS THE FILE.
      int pin = 0;
      int digit = 10000;
      while (input.hasNextLine()){
        String line = input.nextLine();
        int current = 5;
        for (int i = 0; i < line.length(); i++){
            if ((line.charAt(i) == 'D') && (current != 7) && (current != 8) && (current != 9)){
                current += 3;
            }
            if ((line.charAt(i) == 'U') && (current != 1) && (current != 2) && (current != 3)){
                current -= 3;
            }
            if ((line.charAt(i) == 'R') && (current != 3) && (current != 6) && (current != 9)){
                current += 1;
            }
            if ((line.charAt(i) == 'L') && (current != 1) && (current != 4) && (current != 7)){
                current -= 1;
            }
        }
        pin += (digit * current);
        digit /= 10;
      }

      input.close();//releases the file from your program

      return (pin);

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 0; //you can return from a void function just don't put a value.
    }
  }
}
