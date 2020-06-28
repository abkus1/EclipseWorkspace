package OOPConceptsPart2;

public class Car extends Vehicle { //IS-a relationship
	
	public void start() {//Overridden method
		System.out.println("Car----Start");
	}
	
	public void stop() {
		System.out.println("Car----Stop");
	}
	
	public void refuel() {
		System.out.println("Car----Refuel");
	}

}
