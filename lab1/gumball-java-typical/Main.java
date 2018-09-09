
public class Main {

	public static void main(String[] args) {
//Test 1 Quarter Machine		
		GumballMachineQuarter gumballMachine_onequarter = new GumballMachineQuarter(5);
		System.out.println(gumballMachine_onequarter);
		gumballMachine_onequarter.insertQuarter( 25 );
		gumballMachine_onequarter.turnCrank();
		gumballMachine_onequarter.insertQuarter( 25 );
		gumballMachine_onequarter.turnCrank();
		System.out.println(gumballMachine_onequarter);

//Test 2 Quarter Machine		
		
		GumballMachineQuarterFifty gumballMachine_twoquarter = new GumballMachineQuarterFifty(5);
		System.out.println(gumballMachine_twoquarter);
		gumballMachine_twoquarter.insertQuarter( 25 );
		gumballMachine_twoquarter.insertQuarter( 25 );
		gumballMachine_twoquarter.insertQuarter( 25 );
		gumballMachine_twoquarter.turnCrank();
		gumballMachine_twoquarter.insertQuarter( 25 );
		gumballMachine_twoquarter.turnCrank();
		System.out.println(gumballMachine_twoquarter);

//Test Fifty Cents all coin Machine		
		GumballMachineFifty gumballMachine_fiftyCents = new GumballMachineFifty(1);	
		System.out.println(gumballMachine_fiftyCents);
		gumballMachine_fiftyCents.insertCoin( 5 );
		gumballMachine_fiftyCents.insertCoin( 10 );
		gumballMachine_fiftyCents.insertCoin( 25 );
		gumballMachine_fiftyCents.insertCoin( 25 );
		gumballMachine_fiftyCents.turnCrank();
		gumballMachine_fiftyCents.insertCoin( 25 );
		gumballMachine_fiftyCents.insertCoin( 10 );
		gumballMachine_fiftyCents.turnCrank();
		System.out.println(gumballMachine_fiftyCents);                               	
		}
}
