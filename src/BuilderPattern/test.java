package BuilderPattern;

public class test{
	public static void main(String[] args) {
		//Builder Pattern allows for the construction of complex objects step by step.
		
		//Example: 
		//INTERFACES: Item, Packing
		//Wrapper implements Packing, Bottle implements Packing
		//Burger implements Item, ColdDrink implements Item
		//VegBurger, ChickenBurger extend Burger, Coke, Pepsi extends ColdDrink
		//Define Meal class, creates meal of Items
		//Define MealBuilder class, returns a premade Meal
		//Meal vegMeal = MealBuilder.prepareVegMeal();
		//Meal nonVegMeal = MealBuilder.prepareNonVegMeal();
		
		//As we can see, we're building complex objects(Meals) step by step
	}
}