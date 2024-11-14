import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
    ArrayList<String> randomArray = ArrayListPractice.createRandomArray(100);
    System.out.println(randomArray);
    ArrayListPractice.replaceEmpty(randomArray);
System.out.println(ArrayListPractice.makeReversedList(randomArray));
  }
}
