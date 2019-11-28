package StatePattern;

public class StateOne implements State {
	   public void doAction(Context context) {
		   System.out.println("State one - doAction");
		   //methods here
	      context.setState(this);	
	   }
}