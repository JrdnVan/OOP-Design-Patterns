package CompositePattern;
public class test{
	public static void main(String[] args) {
		Component composite1 = new Composite();
		Component composite2 = new Composite();
		Component leaf1 = new Leaf(2);
		Component leaf2 = new Leaf(10);
		Component leaf3 = new Leaf(15);
		
		composite1.add(composite2);
		composite1.add(leaf3);
		
		composite2.add(leaf1);
		composite2.add(leaf2);
		
		System.out.println("composite1 sum = 15 + 2 + 10 = " + composite1.calculateCost());
		System.out.println("composite1 sum = 2 + 10 = " + composite2.calculateCost());

		//       COMPOSITE1 = HEAD
		//LEAF3 = 15    |     COMPOSITE2
		//          LEAF1 = 2     |     LEAF2 = 10       
	}
}