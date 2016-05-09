/**
 * Created by Sadi on 5/10/2016.
 */
public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType){
        EnemyShip newShip = null;

        if (newShipType.equals("U")){
            newShip = new UFOEnemyShip();
        }
        else if (newShipType.equals("R")){
            newShip = new RocketEnemyShip();
        }
        else if (newShipType.equals("B")){
            newShip = new BigUFOEnemyShip();
        }

        return newShip;
    }
}
