import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment x
 * @Sveinson 
*/

public class ViperFighter extends SpaceShip{
    String[] weapons;
    
    // constructors
    public ViperFighter(){
        super();
        weapons = new String[10];
    }
    
    // implement the abstract methods from SpaceShipt
    public void move(int s, int d){
        System.out.println("move like a fighter");
    }
    
    public void land(){
        System.out.println("land like a fighter");
    }

    // getters and setter and other methods specific to ViperFighters
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
