public class test{
  public static void main(String[] args){
    int g = 0;
    int b = 0;
    for (int i = 20; i > 0; i--){
      for(int r = 0; r < 252; r+=8){
        System.out.print("\u001b[48;2;"+r+";"+g+";"+b+";7m");
        System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
      }
      for(int r = 252; r > 0; r-=8){
        System.out.print("\u001b[48;2;"+r+";"+g+";"+b+";7m");
        System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
      }
    }
    System.out.println("\u001b[0m");
  }
}
