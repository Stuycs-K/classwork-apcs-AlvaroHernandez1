//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static int countTrianglesA(String filename){
    //2 Opening a file requires a try/catch
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      int count = 0;
      while (file.hasNextLine()){
        String line = file.nextLine;

        Integer s1 = line.nextInt();
        Integer s2 = line.nextInt();
        Integer s3 = line.nextInt();

        if (isTriangle(s1, s2, s3)
          count++;

        }

      }

      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
  }

  public static boolean isTriangle(int s1, int s2, int s3){
    return(!((s1 + s2 <= s3) || (s1 + s3 <= s2) || (s2 + s3 <= s1)))
  }
}
