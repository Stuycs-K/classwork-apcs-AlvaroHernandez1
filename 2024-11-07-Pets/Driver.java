/*
The Bird class's getName function was overridden to take the superclass function and alter it by inserting "The Mighty" in front of the original output
*/
public class Driver {
  public static void main (String[] args) {
    Animal animal1 = new Animal("Bark", 2, "Theo");
    animal1.speak();

    Bird bird1 = new Bird("Tweet", 1, "Polly", 6, "red");
    bird1.speak();


  }
}
