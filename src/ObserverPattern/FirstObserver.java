package ObserverPattern;
public class FirstObserver extends Observer{
	public FirstObserver(Subject subject) {
		this.subject = subject;
		//ATTACH SUBJECT TO OBSERVER
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("From first observer, " + subject.getState());
	}
}