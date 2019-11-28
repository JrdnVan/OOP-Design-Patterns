package StrategyPattern;

public class test {
   public static void main(String[] args) {
	   //A way to adapt the behaviour of an algorithm at runtime.
	   //Allows algorithm to vary independently from context class using it.
	   
	   int x = 10; 
	   int y = 5;
	   
	   //Different methods.
	   doAdd addition = new doAdd();
	   doSub subtraction = new doSub();
	   doMul multiplication = new doMul();
	   
	   //Context c can adapt to whichever method it'd like to use.
	   Context c = new Context(addition);
	   System.out.println("x + y = " + c.execute(x, y));
	   
	   c = new Context(subtraction);
	   System.out.println("x - y = " + c.execute(x, y));
	   
	   c = new Context(multiplication);
	   System.out.println("x * y = " + c.execute(x, y));	 
	   
   }
}