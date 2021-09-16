import com.sun.source.tree.BreakTree;

public class EncapsulationDemo {
    public static void main(String [] args){
        Player player= new Player("Rahul",100,"Sword");
        int damage=10;
       player.looseHealth(damage);
      System.out.println( player.getName() + " Health is "+ player.healthRemaining());
      player.increaseHealth(10);
      player.increaseHealth(10);
      System.out.println( player.getName() + " Health is "+ player.healthRemaining());
}
}


class  Player {
    private String name;
    private int  health;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }
    public void increaseHealth(int booster){
        this.health= this.health + booster;
    }
    public void looseHealth(int damage){
        this.health= this.health -damage;
        if(this.health <=0){
            System.out.println("Player is knocked out");
        }
    }
    public int healthRemaining(){
        return this.health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }
    public String getWeapon() {
        return weapon;
    }
}