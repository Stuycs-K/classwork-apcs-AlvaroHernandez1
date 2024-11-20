import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day9 {
  public static void main(String[] args) {
    String line = code("input.txt");
    System.out.println("Part A: " + line.length());
    System.out.print("Part B: " + 0);
  }

  public static String code(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      String result = "";
      while (input.hasNextLine()){
        String line = input.nextLine();
        result = output(line);

      }

      input.close();//releases the file from your program

      return (result);

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return null; //you can return from a void function just don't put a value.
    }
  }
  public static String output(String line){
        int i = 0;
        String result = "";
        while (i < line.length()){
            if (line.charAt(i) != '('){
                result += line.charAt(i);
                i++;

            }
            else{
                i++;
                int comp = Integer.parseInt(line.substring(i, line.indexOf("x")));
                int times = Integer.parseInt(line.substring(line.indexOf("x") + 1, line.indexOf(")")));
                while (times > 0){
                    result += line.substring(line.indexOf(")") + 1, line.indexOf(")") + 1 + comp);
                    times--;
                }
                i = line.indexOf(")") + 1 + comp;
            }
            line = line.substring(i);
            i = 0;
        }
    return result;
  }


}
