import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);



    Adventurer p1 = new Berserk("Jeff");
    System.out.println(p1.getName() + ", " + p1.getHP() + "/" + p1.getmaxHP() + ", " + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName());







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
