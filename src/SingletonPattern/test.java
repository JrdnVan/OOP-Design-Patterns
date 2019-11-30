package SingletonPattern;

public class test{
	public static void main(String[] args) {
		//Ensures a class has only ONE instance.
		//Also provides a global access point to this instance.
		
		SingleClass obj = null;
		System.out.println(obj);
		
		obj = SingleClass.getInstance();
		System.out.println(obj);
		
		obj = SingleClass.getInstance();
		obj = SingleClass.getInstance();
		obj = SingleClass.getInstance();
		obj = SingleClass.getInstance();
		obj = SingleClass.getInstance();
		obj = SingleClass.getInstance();
		System.out.println(obj);		
		
	}
}