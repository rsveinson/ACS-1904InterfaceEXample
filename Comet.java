import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment x
 * @Sveinson 
*/

public class Comet extends SpaceBody{
    // istance fields like size weight orbit etc...
    
    // constuctor
    public Comet(){
        super();
        System.out.println("creating a comet.");
    }
    
    // implement abstract methods
    @Override
    public void move(int s, int d){
        System.out.println("move like a comet");
    }
    
    @Override
    public void orbit(){
        System.out.println("I' orbitting like a comet");
    }
    
    // getters and setters
    
    // other methods
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
