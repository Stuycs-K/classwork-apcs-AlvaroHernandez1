public class Driver{
  public static void main(String[] args){
    Adventurer p1 = new Berserk("Jeff");
    Adventurer p2 = new Berserk("Mini-Boss", 50);
    //Test Health
    System.out.println(p1.getName() + "'s Health is " + p1.getHP());
    System.out.println(p2.getName() + "'s Health is " + p2.getHP() + "\n");

    //Test attack 
    System.out.println(p1.attack(p2)); 
    System.out.println(p2 + "'s health = " + p2.getHP());

    //Test killing and multiple attacks
    System.out.println(p1.attack(p2)); 
    System.out.println(p1.attack(p2)); 
    System.out.println(p1.attack(p2)); 
    System.out.println(p1.attack(p2)); 
    System.out.println(p1.attack(p2)); 
    //Test supporting with dead players
    System.out.println(p1.support(p2));
    p1.setHP(80);
    System.out.println(p1.support()); 
    System.out.println(p1.getName() + "'s Health is " + p1.getHP() + "\n");

    p2 = new Berserk("Boss", 200);
    //Test special attacks
    System.out.println(p1.specialAttack(p2)); 
    System.out.println(p1.specialAttack(p2)); 
    p1.restoreSpecial(100);
    //Given extra special
    System.out.println(p1.getName() + " has " + p1.getSpecial() + " " +  p1.getSpecialName());

    System.out.println(p1.specialAttack(p2)); 
    System.out.println(p1.specialAttack(p2));  
    p1.restoreSpecial(120);
    System.out.println(p1.specialAttack(p2));  
    System.out.println(p1.specialAttack(p2));
    System.out.println(p1.specialAttack(p2));

    System.out.println(p1.getName() + " has " + p1.getSpecial() + " " +  p1.getSpecialName());  
  }


}
