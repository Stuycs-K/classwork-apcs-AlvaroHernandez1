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
      boolean[][] lights = new boolean[50][6];
      int count = 0;
      while (input.hasNextLine()){
        String line = input.nextLine();
        if (line.indexOf("rotate row") > -1){
            // rotate row command
            int A = (line.charAt(line.indexOf("=") + 1) - 48); // 0 - 5
            int B = Integer.parseInt(line.substring(line.indexOf("by") + 3)); // 0 - 49
            lights = rotRow(A, B, lights);
        }
        
        if (line.indexOf("rotate column") > -1){
            // rotate column command
            int A = Integer.parseInt(line.substring(line.indexOf("=") + 1, line.indexOf("by") - 1)); // 0 - 49
            int B = (line.charAt(line.length() - 1) - 48); // 0 - 5
            lights = rotCol(A, B, lights);
        }

        if (line.indexOf("rect") > -1){
            // rect command
            int A = Integer.parseInt(line.substring(line.indexOf(" ") + 1, line.indexOf("x"))); // 1 - 50
            int B = (line.charAt(line.length() - 1) - 48); // 1-6
            lights = rect(A, B, lights);
        }
      }
      input.close();//releases the file from your program
      count = count(lights);

      System.out.println(toString(lights));
      return count;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 0; //you can return from a void function just don't put a value.
    }
  }

    public static boolean[][] rotRow(int A, int B, boolean[][] lights){
        boolean[][] origLights = clone(lights);
        for (int i = 0; i < 50; i++){
            int shifted = (50 + (i - B)) % 50;
            lights[i][A] = origLights[shifted][A];
        }
        return lights;
    }

    public static boolean[][] rotCol(int A, int B, boolean[][] lights){
        boolean[][] origLights = clone(lights);
        for (int i = 0; i < 6; i++){
            int shifted = (6 + (i - B)) % 6;
            lights[A][i] = origLights[A][shifted];
        }
        return lights;
    }

    public static boolean[][] rect(int A, int B, boolean[][] lights){
        for (int i = 0; i < A; i++){
            for (int index = 0; index < B; index++){
                lights[i][index] = true;   
            }
        }
        return lights;
    }

    public static int count(boolean[][] lights){
        int count = 0;
        for (int i = 0; i < lights.length; i++){
            for (int index = 0; index < lights[0].length; index++){
                if (lights[i][index] == true)
                    count++;
            }
        }
        return count;
    }

    public static boolean[][] clone (boolean[][] lights){
        boolean[][] lightsCopy = new boolean[lights.length][lights[0].length];
        for (int i = 0; i < lights.length; i++) {
            lightsCopy[i] = Arrays.copyOf(lights[i], lights[i].length);
        }
        
        return lightsCopy;
    }

    public static String toString(boolean[][] lights){
        String end = "";
        for (int index = 0; index < 6; index++){
            for (int i = 0; i < lights.length; i++){
                if (lights[i][index])
                    end += "1";
                else
                    end += " ";
            }
            end += "\n";
        }
        return end;
    }
}