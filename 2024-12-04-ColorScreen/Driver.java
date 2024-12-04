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
    System.out.println(Text.RESET);
  }
  
}
