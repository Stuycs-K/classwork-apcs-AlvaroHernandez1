import java.util.Random;
public class Berserk extends Adventurer{
  private int rage, maxRage;


  /*There is no no-arg constructor. Be careful with your subclass constructors.*/

  public Berserk(String name){
    super(name, 90);
    this.rage = 100;
    this.maxRage = 200;
  }

  public Berserk(String name, int hp){
    super(name, hp);
    this.rage = 100;
    this.maxRage = 200;
  }

  //Abstract methods are meant to be implemented in child classes.

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return("rage");
  }
  //accessor methods
  public int getSpecial(){
    return this.rage;
  }
  public void setSpecial(int n){
    rage = n;
  }
  public int getSpecialMax(){
    return 200;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    int damage = 10 + (int)(Math.random() * 10);
    if (other.getHP() - damage > 0){
      other.applyDamage(damage);
      return (getName() + " dealt " + damage + " damge!");
    }
    int temp = other.getHP();
    other.setHP(0);
      return (getName() + " dealt " + temp + " damge and killed " + other.getName());
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    int heal = ((int) (Math.random()*10)) + 10;
    if (other.getHP() != 0){
      if (other.getHP() + heal > other.getmaxHP()){
        int temp = other.getmaxHP() - other.getHP();
        other.setHP(other.getmaxHP());
        return getName() + " healed " + other.getName() + " for " + temp;
      }
      else{
        other.setHP(other.getHP() + heal);
        return getName() + " healed " + other.getName() + " for " + heal;
      }
    }
    return other.getName() + " is dead and could not be healed";
  }

  //heall or buff self
  public String support(){
    if (getHP() > 0){
      setHP(getHP() + 20);
      return getName() + " healed themselves for 20 health!";
    }
    return getName() + " could not be healed since they are dead!";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if (rage > 60){
    int damage = 30 + (int) (Math.random() * 40);
    rage -= 60;
    if (other.getHP() - damage > 0){
      other.applyDamage(damage);
      return (getName() + " used special to deal " + damage + " damge!");
    }
    int temp = other.getHP();
    other.setHP(0);
    return (getName() + " used special to deal " + temp + " damge and killed " + other.getName());
    }
    else
      return getName() + " didn't have enough Rage!";
  }

  /*
    standard methods
  */
  public void applyDamage(int amount){
    setHP(getHP() - amount);
  }
}
