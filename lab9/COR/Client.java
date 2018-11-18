package COR;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Client {

    public void runTest()
    {
        
        ArrayList<String> requests=new ArrayList<String>();
        requests.add("R2");
        requests.add("R3");
        requests.add("R1");
        requests.add("RX");

        
        Predicate<String> hand1Tester =  (a) -> a.equalsIgnoreCase("R1");		
        Predicate<String> hand2Tester  = (a) -> a.equalsIgnoreCase("R2");
        Predicate<String> hand3Tester  = (a) -> a.equalsIgnoreCase("R3");

   	
        Handler hand1 = new ConcreteHandler1(hand1Tester) ;
        Handler hand2 = new ConcreteHandler2(hand2Tester) ;
        Handler hand3 = new ConcreteHandler3(hand3Tester) ;
      	
        hand1.setSuccessor(hand2);
        hand2.setSuccessor(hand3);

     
        requests.stream().forEach(p -> {System.out.println( "Sending "+p+"..."); hand1.handleRequest(p);});

    }
 
    
    public static void main( String [] args )
    {
        Client c = new Client() ;
        c.runTest() ;
    }
    

}
