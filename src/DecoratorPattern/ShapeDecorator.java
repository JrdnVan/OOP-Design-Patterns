package DecoratorPattern;
public class ShapeDecorator implements Shape{
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	public void draw() {
		// TODO Auto-generated method stub
		decoratedShape.draw();
	}
}