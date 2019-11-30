package IteratorPattern;
public class test{
	public static void main(String args[]) {
		//Use the Iterator Pattern to access elements of an OBJECT without exposing underlying representation.
		NameContainer names = new NameContainer();
		
		for(Iterator i = names.getIterator(); i.hasNext();) {
			System.out.println((String)i.next());
		}
	}
}