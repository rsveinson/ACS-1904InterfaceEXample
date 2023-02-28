import java.util.ArrayList;
import java.util.Collections;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class MockSpaceShipGae{
    public static void main(String[] args){
        final int MAXASSETS = 100;
        
        // create an arrau for all of my game assets
        //Moveable[] assets = new Moveable[MAXASSETS];
        
        // of maybe an array list
        ArrayList<Moveable> assets = new ArrayList<>();
        
        // ViperFighter viperfitghter = new ViperFighter();
        // Shuttle shuttle = new Shuttle();
        // Comet comet = new Comet();
        
        assets.add(new ViperFighter());
        assets.add(new Shuttle());
        assets.add(new Comet());
        
        Comet comet = (Comet)assets.get(2);
        
        ViperFighter viperFighter = new ViperFighter();
        
        System.out.println(comet instanceof Moveable);
        System.out.println(comet instanceof SpaceBody);
        
        // try some comparable stuff on space ships
        ArrayList<SpaceShip> ships = new ArrayList<>();
        ships.add(new ViperFighter("Starbuck", 1234, 100));
        ships.add(new ViperFighter("Enterprise", 1235, 2500));
        ships.add(new ViperFighter("Defiant", 1236, 500));
        ships.add(new Shuttle("Galileo", 1236, 350, 100));
        ships.add(new Shuttle("Xerxes", 1237, 200, 75));
        
        printList(ships);
        
        Collections.sort(ships);
        
        System.out.println("\nNow Sorted");
        printList(ships);
        
        System.out.println("end of program");
    }
    
    public static void printList(ArrayList<SpaceShip> ships){
        for(SpaceShip s : ships){
            System.out.println(s);
        }
    }
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
