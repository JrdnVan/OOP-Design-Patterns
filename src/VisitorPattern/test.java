package VisitorPattern;
public class test {
    public static void main(String[] args) {
    	//A behavioural design pattern that ADDS new BEHAVIOURS to EXISTING OBJECTS without modification.
    	//Example, adding Mouse or Keyboard to Computer.
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}