import java.util.Random;
public class Adventurer{
  private String name;
  private int HP,maxHP;
  private int rage;


  /*There is no no-arg constructor. Be careful with your subclass constructors.*/

  public Adventurer(String name){
      super(name);
  }

  public Adventurer(String name, int hp){
    super(name, hp);
  }

  //concrete method written using abstract methods.
  //refill special resource by amount, but only up to at most getSpecialMax()
  public int restoreSpecial(int n){
      if( n > getSpecialMax() - getSpecial()){
              n = getSpecialMax() - getSpecial();
      }
      setSpecial(getSpecial()+n);
      return n;
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
    int damage = 10 + (int)(Math.random * 10);
    other.applyDamage(damage);
    return ("Berserk dealt " + damage = " damge!");
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    return "Berserk has no healing abilities /:";
  }

  //heall or buff self
  public abstract String support(){

  }

  //hurt or hinder the target adventurer, consume some special resource
  public abstract String specialAttack(Adventurer other);

  /*
    standard methods
  */
  public void applyDamage(int amount){
    this.HP -= amount;
  }



  //toString method
  public String toString(){
    return this.getName();
  }

  //Get Methods
  public String getName(){
    return name;
  }

  public int getHP(){
      return HP;
  }

  public int getmaxHP(){
      return maxHP;
  }
  public void setmaxHP(int newMax){
        maxHP = newMax;
  }

  //Set Methods
  public void setHP(int health){
      this.HP = health;
  }

  public void setName(String s){
      this.name = s;
  }
}
