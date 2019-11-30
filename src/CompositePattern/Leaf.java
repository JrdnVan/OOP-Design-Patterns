package CompositePattern;
public class Leaf implements Component{
	private double cost;
	public Leaf(double cost) {
		this.cost = cost;
	}
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		return;
	}
	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		return;
	}
	@Override
	public double calculateCost() {
		return cost;
	}
	
	//getter&setters
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}	
}