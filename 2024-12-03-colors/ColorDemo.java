public class ColorDemo{
  public static void main(String[] args){
      System.out.println("Make window pretty big!");
      try{
              Thread.sleep(1000);
      }catch(Exception e){
      }
    int g = 50;
    int b = 0;
    for (int i = 500; i > 0; i--){
      for(int r = 0; r < 252; r+=16){
        System.out.print("\u001b[48;2;"+r+";"+g+";"+b+";7m");
        System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m ");
      }
      for(int r = 252; r > 0; r-=16){
        System.out.print("\u001b[48;2;"+r+";"+g+";"+b+";7m");
        System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m ");
      }
      sleep(5);
    }
    System.out.print("\u001b[0m Done");
  }

  public static void sleep(int milli){
      try{
              Thread.sleep(milli);
      }catch(Exception e){
      }
}
}
