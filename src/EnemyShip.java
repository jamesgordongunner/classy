/**
 * Created by Sadi on 5/10/2016.
 */
public abstract class EnemyShip {

    private String name;
    private double amtdamage;

    public String getName(){return name;}
    public void setName(String newname){name = newname;}

    public double getAmtdamage(){return amtdamage;}
    public void setAmtdamage(double newdamage){amtdamage = newdamage;}

    public void followHeroShip(){
        System.out.println(getName()+" is following the hero.");
    }

    public void displayEnemyShip(){
        System.out.println(getName()+" is on the screen.");
    }

    public void enemyShipShoots(){
        System.out.println(getName()+" attacks does "+getAmtdamage());
    }
}
