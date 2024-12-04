public class Driver{
  public static void main(String[] args){
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);
    Text.color(Text.YELLOW);
    System.out.println("Yellow");
    System.out.print(Text.RESET);
  }
}
