

public class Main {

	public static void main(String[] args) {
/*
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	*/
		GumballMachineQuarterFifty gumballMachine = new GumballMachineQuarterFifty(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
/*
		GumballMachineFifty gumballMachine = new GumballMachineFifty(5);
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter(5);
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter(20);
		gumballMachine.turnCrank();	
		System.out.println(gumballMachine);
*/
	}
}
