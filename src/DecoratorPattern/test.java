package DecoratorPattern;
public class test{
	public static void main(String[] args) {
		//Decorator pattern adds additional functionality to a class at RUNTIME.
		
		//Already existing classes
		Shape circle = new Circle();
		Shape square = new Square();
		
		//... some methods
		circle.draw();
		square.draw();
		
		System.out.println("\n");
		
		//Now, we want our circles to be red.
		//Decorator Pattern in action
		Shape redCircle = new RedShapeDecorator(circle);
		Shape redSquare = new RedShapeDecorator(square);
		redCircle.draw();
		redSquare.draw();
	}
}