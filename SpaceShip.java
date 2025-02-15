import java.util.Comparator;

/** 
 * ACS-1904 Assignment x
 * @Sveinson
 */


public abstract class SpaceShip implements Moveable,
            Comparator<String>, Comparable<SpaceShip>{


    protected String name;
    protected int vin;
    protected int fuel;

    // constructor
    public SpaceShip(){
        name = "default";
        vin = 0;
        fuel = 0;
    }

    // full arg constructor
    public SpaceShip(String name, int vin, int fuel){
        this.name = name;
        this.vin = vin;
        this.fuel = fuel;
    }

    // implement compareTo from the comparable interface
    // should be passed down to the subclasses that extend this one
    @Override
    public int compareTo(SpaceShip s){
        return name.compareTo(s.name);
    }// end compare to

    // abstract method must be implemented in derived classes
    //public abstract void move(int speed, int direction);
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
    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();
        st.append(this.name + ": " + this.vin);

        return st.toString();
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
