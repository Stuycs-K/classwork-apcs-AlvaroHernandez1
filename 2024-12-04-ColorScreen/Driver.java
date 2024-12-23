import java.util.Arrays;

public class Driver{
  public static void main(String[] args){
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);
    Text.color(Text.YELLOW, Text.background(Text.YELLOW));
    for (int col = 1; col <= 80; col++){
      Text.go(1, col);
      System.out.print(" ");
    }
    for (int row = 1; row <= 30; row++){
      Text.go(row, 1);
      System.out.print(" ");
    }
    for (int col = 1; col <= 80; col++){
      Text.go(30, col);
      System.out.print(" ");
    }
    for (int row = 1; row <= 30; row++){
      Text.go(row, 80);
      System.out.print(" ");
    }
    //rand arr
    int[] rand = new int[] {
      (int) (Math.random() * 100),
      (int) (Math.random() * 100),
      (int) (Math.random() * 100)
    };
    
    int col2 = 20;
    for (int i = 0; i < 3; i++){
      System.out.print("\u001b[0m");
      Text.go(2, col2);
      if (rand[i] < 25)
        Text.color(Text.RED, Text.BRIGHT);
      if (rand[i] > 75)
        Text.color(Text.GREEN, Text.BRIGHT);
      System.out.print(rand[i]);
      col2 += 20;
    }

    // line
    Text.color(Text.YELLOW);
    for (int col = 2; col < 80; col++){
      Text.go(3, col);
      System.out.print("-");
    }

    //extra
    int column = 15;
    for (int row = 6; row < 28; row++){
      Text.go(row, column);
      Text.color(Text.RED, Text.background(Text.RED));
      System.out.print(" ");
    }
    column = 35;
    for (int row = 6; row < 28; row++){
      Text.go(row, column);
      Text.color(Text.RED, Text.background(Text.RED));
      System.out.print(" ");
    }
    column = 60;
    for (int row = 6; row < 28; row++){
      Text.go(row, column);
      Text.color(Text.RED, Text.background(Text.RED));
      System.out.print(" ");
    }

    int row = 6;
    for (int col = 55; col < 66; col++){
      Text.go(row, col);
      Text.color(Text.RED, Text.background(Text.RED));
      System.out.print(" ");
    }
    row = 27;
    for (int col = 55; col < 66; col++){
      Text.go(row, col);
      Text.color(Text.RED, Text.background(Text.RED));
      System.out.print(" ");
    }
    row = 17;
    for (int col = 15; col < 35; col++){
      Text.go(row, col);
      Text.color(Text.RED, Text.background(Text.RED));
      System.out.print(" ");
    }


    Text.go(30, 80);
    System.out.println(Text.RESET);

    System.out.print(Arrays.toString(rand));
  }
  
}
