package COR;

import java.util.function.Predicate;

public interface Handler {

	void handleRequest( String request );
	void setSuccessor(Handler next);

}
