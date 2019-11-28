package StatePattern;
public class test {
   public static void main(String[] args) {
	   //State pattern is used when states will vary the behaviour
	   //of an object whose composition includes that state.
	   
	   Context c = new Context();
	   State stateOne = new StateOne();
	   State stateTwo = new StateTwo();
	   
	   System.out.println(c.getState());
	   
	   stateOne.doAction(c);
	   System.out.println(c.getState());

	   stateTwo.doAction(c);
	   System.out.println(c.getState());
   }
}