import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day3 {
  public static void main(String[] args) {
    System.out.println(code("input.txt"));
  }

  public static int code(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      int sum = 0;
      while (input.hasNextLine()){
        int[] chars = new int[26];
        String origLine = input.nextLine();
        String line = returnNums(origLine);
        line = removeDash(line);
        for (int i = 0; i < line.length(); i++){
            chars[(line.charAt(i)) - 97]++;
        }
        int[] temp = clone(chars);
        Arrays.sort(temp);
        String key = "";
        for (int i = temp.length - 1; i > 0; i--){
            int index = indexOf(temp[i], chars);
            key += (char) (index + 97);
            chars[index] = -1;
        }
        key = key.substring(0,5);
        String checksum = origLine.substring(origLine.length() - 6, origLine.length() - 1);
        if (key.equals(checksum))
            sum += Integer.parseInt(origLine.substring(origLine.length() - 10, origLine.length() - 7));
      }


      input.close();//releases the file from your program

      return (sum);

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 0; //you can return from a void function just don't put a value.
    }
  }

  public static String returnNums (String line){
    return (line.substring(0, (line.length() - 11)));
  }

    public static String removeDash (String line){
        String newLine = "";
        for (int i = 0; i < line.length(); i++){
            if (line.charAt(i) == '-');
            else
                newLine += line.charAt(i);
        }
        return newLine;
    }

    public static int[] clone (int[] line){
        int[] newArr = new int[26];
        for (int i = 0; i < line.length; i++){
            newArr[i] = line[i];
        }
        return newArr;
    }

    public static int indexOf(int num, int[] nums){
        for (int i = 0; i < nums.length; i++){
        if (nums[i] == num){
            return i;
        }
        }
        return -1;
    }

    public static int[] remove(int num, int[] chars){
        int[] newArr = new int[chars.length-1];
        for (int i = 0; i <  chars.length - 1; i++){
            newArr[i] = chars[i];
        }
        return newArr;
    }
}
