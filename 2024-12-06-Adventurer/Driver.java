public class Driver{
  public static void main(String[] args){
    Adventurer p1 = new Berserk("Alvaro");
    //Test Health
    System.out.println(p1.getName() + "'s Health is " + p1.getHP());
    System.out.println(p2.getName() + "'s Health is " + p2.getHP() + "\n");
    // Test attack 
    System.out.println(p1.attack(p2)); 
    System.out.println(p2 + "'s health = " + p2.getHP());


  }


}
