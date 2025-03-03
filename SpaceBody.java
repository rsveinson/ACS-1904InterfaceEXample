/** 
 * ACS-1904 Assignment x
 * @Sveinson
*/

public abstract class SpaceBody implements Moveable{

    
    // constructors
    public SpaceBody(){
        System.out.println("creating a space body");
    }
    

    // abstract method must be implemented in derived classes
    //public abstract void move(int speed, int direction);
    public abstract void orbit();
    
    // getters
    
    // setters
    
    // other


}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
