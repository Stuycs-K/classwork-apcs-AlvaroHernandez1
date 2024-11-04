//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTriA.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }

  public static int countTrianglesA(String filename){
    //2 Opening a file requires a try/catch
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      int count = 0;
      while (input.hasNextInt()){
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();

        if (isTriangle(s1, s2, s3))
          count ++;

      }

      input.close();//releases the file from your program
      return count;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 0; //you can return from a void function just don't put a value.
    }
  }

  public static int countTrianglesB(String filename){
    //2 Opening a file requires a try/catch
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      int count = 0;
      while (input.hasNextInt()){
        int s11 = input.nextInt();
        int s12 = input.nextInt();
        int s13 = input.nextInt();
        int s21 = input.nextInt();
        int s22 = input.nextInt();
        int s23 = input.nextInt();
        int s31 = input.nextInt();
        int s32 = input.nextInt();
        int s33 = input.nextInt();

        if (isTriangle(s11, s21, s31))
          count ++;
        if (isTriangle(s12, s22, s32))
            count ++;
        if (isTriangle(s13, s23, s33))
          count ++;
      }

      input.close();//releases the file from your program
      return count;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 0; //you can return from a void function just don't put a value.
    }
  }

  public static boolean isTriangle(int s1, int s2, int s3){
    return(!((s1 + s2 <= s3) || (s1 + s3 <= s2) || (s2 + s3 <= s1)));
  }
}
