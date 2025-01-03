public class MakeWords{
  public static void main(String[] args){
    mw(5,"","abcd");
  }

  public static void mw(int remaining, String result, String alphab){
    if (remaining > 0){
      for (int i = 0; i < alphab.length(); i++){
        mw(remaining - 1, result + alphab.charAt(i), alphab);
      }
    }
    else{
      System.out.println(result);
    }
  }
}
