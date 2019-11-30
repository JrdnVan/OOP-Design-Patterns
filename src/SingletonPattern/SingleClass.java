package SingletonPattern;

public class SingleClass {
	
	private static SingleClass instance = new SingleClass();
	private SingleClass() {}
	
	public static SingleClass getInstance(){
		return instance;
	}	
	
	public void action(String s) {
		System.err.println(s);
	}
}