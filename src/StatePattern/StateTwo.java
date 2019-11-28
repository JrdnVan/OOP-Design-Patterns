package StatePattern;

public class StateTwo implements State {
	   public void doAction(Context context) {
		   System.out.println("State two - doAction");
		   //methods here
	      context.setState(this);	
	   }
}