package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
	private List<Component> children = new ArrayList<>();
	//private double cost;
	public Composite() {
		//this.cost = cost;
	}
	
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public double calculateCost() {
		// TODO Auto-generated method stub
		double ans = 0;
		for(Component c : children) {
			ans += c.calculateCost();
		}
		return ans;
	}
	
	//getter&setters
	/*
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}	*/	
}