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

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  ArrayList<String> returnArray = new ArrayList<String> (a.size() + b.size());
  if (a.size() >= b.size()){
    for (int i = 0; i < b.size(); i++){
      returnArray.add(a.get(0));
      returnArray.add(b.get(i));
      a.remove(0);
    }
    for (int i = 0; i < a.size(); i++){
      returnArray.add(a.get(i));
    }

    return returnArray;
  }
  else{
    for (int i = 0; i < a.size(); i++){
      returnArray.add(a.get(i));
      returnArray.add(b.get(0));
      b.remove(1);
    }
    for (int i = 0; i < b.size(); i++){
      returnArray.add(b.get(i));
    }

    return returnArray;
  }


  }
}
