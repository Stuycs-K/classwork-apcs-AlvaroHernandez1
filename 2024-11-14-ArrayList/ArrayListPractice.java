import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    String returnString = "";
    ArrayList<String> returnArrayList = new ArrayList<String>(size);
    for (int i = 0; i < size; i++){
      int randoNmb = (int) (11 * Math.random());
      if (randoNmb != 0)
        returnArrayList.add(returnString + randoNmb);
      else
        returnArrayList.add(returnString);
    }
    return returnArrayList;

  }

  public static void replaceEmpty( ArrayList<String> original){
    //Modify the ArrayList such that it has all of the empty strings are
    //replaced with the word "Empty".
    for (int i = 0; i < original.size(); i++){
       if (original.get(i).equals(""))
        original.set(i, "Empty");
    }
  }

  public static ArrayList<String> makeReversedList(ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
  ArrayList<String> returnArray = new ArrayList<String> (original.size());
  for (int i = original.size(); i > 0; i--) {
    returnArray.add(original.get(i - 1));
  }
  return returnArray;
}
}
