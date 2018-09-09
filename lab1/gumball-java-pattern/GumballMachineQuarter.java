
/**
 * Write a description of class GumballMachineQuarter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachineQuarter extends GumballMachine
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class GumballMachineQuarter
     */
    public GumballMachineQuarter(int numberGumballs)
    {
        // initialise instance variables
        super(numberGumballs);
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } 
    
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
