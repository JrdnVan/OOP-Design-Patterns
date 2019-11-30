package FactoryMethod;

public class test{
	public static void main(String[] args) {
		//Create objects without exposing creation logic.
		
		//Abstract Factory Method is pretty much the same except with a super factory creating other factories.
		//AKA Factory of factories
		//Just make a new class FactoryProducer that makes factories.
		
		ShapeFactory factory = new ShapeFactory();
		
		Shape circle = factory.getShape("CIRCLE");
		circle.draw();
		
		Shape square = factory.getShape("SQUARE");
		square.draw();
	}
}