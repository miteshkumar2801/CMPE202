package chain_of_responsibility_lambda;

import java.util.function.Predicate;

public class ConcreteHandler3 implements Handler {


    private Handler successor = null;
    private Predicate<String> tester;
    public ConcreteHandler3(Predicate<String> filter) {this.tester=filter;}
	public void handleRequest( String request ) {
        System.out.println( "R3 got the request...");
        if ( tester.test(request) )
        {
            System.out.println( this.getClass().getName() + " => This one is mine!");
        }
        else
        {
            if ( successor != null )
                successor.handleRequest(request);
        }
    }

    public void setSuccessor(Handler next) {
        this.successor = next ;
    }


}
