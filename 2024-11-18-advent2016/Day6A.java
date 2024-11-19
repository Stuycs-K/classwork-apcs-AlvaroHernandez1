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
        column1 += line.charAt(1);
        column2 += line.charAt(2);
        column3 += line.charAt(3);
        column4 += line.charAt(4);
        column5 += line.charAt(5);
        column6 += line.charAt(6);
        column7 += line.charAt(7);


      }
      input.close();//releases the file from your program
      String end = "";

      end += findChar(column0);
      end += findChar(column1);
      end += findChar(column2);
      end += findChar(column3);
      end += findChar(column4);
      end += findChar(column5);
      end += findChar(column6);
      end += findChar(column7);

      System.out.println(end);
      return 0;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 0; //you can return from a void function just don't put a value.
    }
  }

  public static char findChar(String total){
    int[] chars = new int[26];
    for (int i = 0; i < total.length(); i++){
      chars[(total.charAt(i) - 97)]++;
    }
    int max = maxChar(chars);
    int index = indexOf(max, chars);  
    return (char) (index + 97);
  }

  public static int maxChar(int[] chars){
    int current = 0;
    for (int i = 0; i < chars.length; i++){
      if (chars[i] > current)
        current = chars[i];
    }
    return current;
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
