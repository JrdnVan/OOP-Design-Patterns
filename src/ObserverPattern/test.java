package ObserverPattern;
public class test{
	public static void main(String[] args) {
		//Observer pattern used to implement distributed event handling systems.
		//Any state change in a subject will notify all observers linked to that subject.
		Subject subject = new Subject();
		
		new FirstObserver(subject);
		new SecondObserver(subject);
		
		subject.setState(15);
		//Subject updated, hence all Observers will be notified that state = 15;
		subject.setState(10);
		//Subject updated, hence all Observers will be notified that state = 10;

	}
}