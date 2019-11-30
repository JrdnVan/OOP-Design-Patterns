package ObserverPattern;
public class SecondObserver extends Observer{
	public SecondObserver(Subject subject) {
		this.subject = subject;
		//ATTACH SUBJECT TO OBSERVER
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("From second observer, " + subject.getState());
	}
}