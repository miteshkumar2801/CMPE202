public class GumballMachineFifty
{

    private int num_gumballs;
	private int tot_Coins;

    public GumballMachineFifty( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
		this.tot_Coins = 0;
    }

    public void insertCoin(int coin)
    {
        if ( coin > 0 ) 
		{
			this.tot_Coins = this.tot_Coins + coin ;
		}	
	}

  
    public void turnCrank()
    {
    	if ( this.tot_Coins >= 50)
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.tot_Coins = this.tot_Coins  - 50;
    			System.out.println( "Thanks for your Fifty Cents.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a coin"  ) ;
    	}        
    }
}
