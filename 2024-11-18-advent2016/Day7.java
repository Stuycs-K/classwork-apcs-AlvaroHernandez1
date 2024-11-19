import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day7 {
  public static void main(String[] args) {
    System.out.println(code("input.txt"));
  }

  public static int code(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      int total = 0;
      while (input.hasNext()){
        String line = input.next();
        int count = count(line);
        String outside = line.substring(0, line.indexOf("["));
        String inside = line.substring(line.indexOf("[") + 1, line.indexOf("]"));
        if (count > 1){
            inside += " " + line.substring(secondIndexOf('[', line) + 1, secondIndexOf(']', line));
            outside += " " + line.substring(line.indexOf("]") + 1, secondIndexOf('[', line));
        }
        if (count > 2){
            inside += " " + line.substring(line.lastIndexOf("[") + 1, line.lastIndexOf("]"));
            outside += " " + line.substring(secondIndexOf(']', line) + 1, line.lastIndexOf("["));
        }
        outside += " " + line.substring(line.lastIndexOf("]") + 1);

        if (count == 4)
            System.out.println("PROBLEMO");
        //System.out.println(outside);

        if (!(findsTLS(inside)) && (findsTLS(outside))){
            total++;
        }

        
      }
      input.close();//releases the file from your program

      return total;

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

    public static int secondIndexOf(char brack, String line){
        int count = 0;
        for (int i = 0; i < line.length(); i++){
            if (line.charAt(i) == brack)
                count++;
            if (count > 1)
                return i;
        }
        return -1;
    }

    public static boolean findsTLS(String line){
        for (int i = 3; i < line.length(); i++){
            if ((line.charAt(i-3) == line.charAt(i)) && (line.charAt(i-2) == line.charAt(i-1)) && (line.charAt(i) != line.charAt(i-1)))
                return true;
        }
        return false;
    }
}