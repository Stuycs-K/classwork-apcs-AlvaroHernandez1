public class Fibonacci{
  public static void main(String[] args){
    System.out.println(fib(5));
  }
  public int fib(int n) {
    if (n > 1){
      return fib(n-2) + fib(n-1);
    }
    if (n == 0)
      return 0;
    return 1;
  }

}
