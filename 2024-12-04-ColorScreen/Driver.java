public class Driver{
  public static void main(String[] args){
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);
    System.out.print(Text.color(YELLOW));
    System.out.println("Yellow");
    System.out.println(Text.RESET);
  }
}
