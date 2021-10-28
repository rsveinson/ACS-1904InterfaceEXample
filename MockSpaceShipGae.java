import java.util.ArrayList;
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
        
        Comet comet = (Comet)assets.get(1);
        
        
       
        
        
        
        
        
        

        
        


        System.out.println("end of program");
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
