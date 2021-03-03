import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment x
 * @Sveinson 
*/

public class Shuttle extends SpaceShip{
    private int cargoLimit;
    
    // constructors
    public Shuttle(){
        super();
        cargoLimit = 0;
    }
    
    // implement the abstract methods from SpaceShipt
    public void move(int s, int d){
        System.out.println("move like a shuttle");
    }
    
    public void land(){
        System.out.println("land like a shuttle");
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
