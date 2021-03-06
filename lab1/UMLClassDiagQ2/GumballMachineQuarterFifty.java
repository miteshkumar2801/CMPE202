
/**
 * Write a description of class GumballMachineQuarterFifty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachineQuarterFifty extends GumballMachine
{
    // instance variables - replace the example below with your own
    private int total;

    /**
     * Constructor for objects of class GumballMachineQuarterFifty
     */
    public GumballMachineQuarterFifty(int numberGumballs)
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
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    
    public void insertQuarter() {
    	this.total += 25;
    	if (this.total >= 50)
    	{
    		state.insertQuarter();
    		this.total -= 50;
    	} else {
    		System.out.println("You haven't inserted Fifty cents, Please insert one more quarter");
    	}
 
	}
}
