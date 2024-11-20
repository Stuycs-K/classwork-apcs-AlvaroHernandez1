import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day9A {
  public static void main(String[] args) {
    System.out.print("Part A: ");
    int lineLength = code("input.txt");
  }

  public static int code(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      String resultA = "";
      int resultB = 0;
      while (input.hasNextLine()){
        String line = input.nextLine();
        resultA = outputA(line);
        System.out.println(resultA.length());
        resultB = outputB(convert(line));

        while (resultA.indexOf("(") > -1){
          resultB = outputB(resultA);
        }
      }
      

      input.close();//releases the file from your program
      System.out.print("Part B: ");
      return (resultB);

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 0; //you can return from a void function just don't put a value.
    }
  }
  public static String outputA(String line){
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

  public static int[] convert(String line){
    for (int i = 0; i < line.length(); i++){
      
    }
  }

public static int[] outputB(int[] line){
        int i = 0;
        int count = 0;
        while (i < line.length()){
            if (line.charAt(i) != '('){
                count ++;
                i++;

            }
            else{
                i++;
                int comp = Integer.parseInt(line.substring(i, line.indexOf("x")));
                int times = Integer.parseInt(line.substring(line.indexOf("x") + 1, line.indexOf(")")));
                while (times > 0){
                    count += (line.substring(line.indexOf(")") + 1, line.indexOf(")") + 1 + comp)).length();
                    times--;
                }
                i = line.indexOf(")") + 1 + comp;
            }
            line = line.substring(i);
            i = 0;
        }
    return count;
  }

}
