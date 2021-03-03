/** 
 * ACS-1904 Assignment x
 * @Sveinson
*/

public abstract class SpaceShip{
    protected String name;
    protected int vin;
    protected int fuel;
    
    
    // constructors
    public SpaceShip(){
        name = "default";
        vin = 0;
        fuel = 0;
    }

    // full arg constructor would go here
 
    // abstract method must be implemented in derived classes
    public abstract void move(int speed, int direction);
    public abstract void land();
    
    // getters
    public int getFuel(){
        return fuel;
    }
    
    // other getters for 
    
    // setters
    public void addFuel(int amt){
        fuel += amt;
    }
    
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
