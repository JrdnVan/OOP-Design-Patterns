package CompositePattern;
public interface Component{
	
	public void add(Component c);
	public void remove(Component c);
	
	public double calculateCost();
}