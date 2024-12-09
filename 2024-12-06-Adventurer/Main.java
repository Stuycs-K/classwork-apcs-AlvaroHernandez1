import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);



    Adventurer p1 = new Berserk("Jeff");
    System.out.println(p1 + ", " + p1.getHP() + "/" + p1.getmaxHP() + ", " + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName());

    Adventurer p2 = new CodeWarrior();
    System.out.println(p2 + ", " + p2.getHP() + "/" + p2.getmaxHP() + ", " + p2.getSpecial() + "/" + p2.getSpecialMax() + " " + p2.getSpecialName());

    //Asks fpr p1 action
    boolean quit = false;
    while (p1.getHP() > 0 && p2.getHP() > 0 && quit == false){
      System.out.print("Enter Action a)ttack / (sp)ecial / (su)pport / quit: ");
      String action = userInput.nextLine();
      if (action.equals("attack") || action.equals("a")){
        p1.attack(p2);
      }
      if (action.equals("special") || action.equals("sp")){
        p1.specialAttack(p2);
      }
      if (action.equals("support") || action.equals("su")){
        p1.support();
        p1.support(p2);
      }
      if (action.equals("quit")){
        quit = true;
      }
    }

    if (quit == true)
      System.out.println("You surrendered and " + p2 + " won");




    /*
    System.out.print("Enter Username: ");
    String userName = userInput.nextLine();
    System.out.println(userName + ", ");
    System.out.print("Enter Health: ");
    String HP = userInput.nextLine();
    System.out.print("Enter Max Health: ");
    String maxHP = userInput.nextLine();

    System.out.println(HP + "/" + maxHP + ", " + special + "/" + maxSpecial + " " + specialName);
    */
  }
}
