
public class GumballMachineQuarterFifty
{

    private int num_gumballs;
	private int quarterCount;
    
	public GumballMachineQuarterFifty( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
		this.quarterCount= 0;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 ) 
		{
			this.quarterCount += 1;	
		} else { 
    		System.out.println( "Please insert a quarter" ) ;
    	}
	}

  
    public void turnCrank()
    {
    	if ( this.quarterCount >= 2)
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.quarterCount -= 2;	
				System.out.println( "Thanks for your 2 quarters.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
}
