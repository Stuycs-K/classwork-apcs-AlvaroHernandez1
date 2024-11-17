import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
    ArrayList<String> randomArray = ArrayListPractice.createRandomArray(100);
    System.out.println(randomArray);
    ArrayListPractice.replaceEmpty(randomArray);
    System.out.println(ArrayListPractice.makeReversedList(randomArray));
    ArrayList<String> a = new ArrayList<String>(3);
    a.add("1");
    a.add("3");
    a.add("5");
    ArrayList<String> b = new ArrayList<String>(2);
    b.add("2");
    b.add("4");

    System.out.println(ArrayListPractice.mixLists(a, b));
    System.out.println(ArrayListPractice.mixLists(b, a));

    b.add("6");

    System.out.println(ArrayListPractice.mixLists(a, b));
    System.out.println(ArrayListPractice.mixLists(b, a));

    b.add("8");

    System.out.println(ArrayListPractice.mixLists(a, b));
    System.out.println(ArrayListPractice.mixLists(b, a));
  }
}
