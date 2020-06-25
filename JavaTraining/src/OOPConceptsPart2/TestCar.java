package OOPConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//Static Polymorphism or Compile time polymorphism.
		
		BMW b=new BMW();
		b.start(); //inheritance method overriding
		b.stop(); //this method will be inherited from parent class Car
		b.refuel(); //this method will be inherited from parent class Car
		b.theftSaftey(); //this method will be inherited from child class BMW
		b.engine();
		
		System.out.println("************************");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("************************");
		
		Car c1=new BMW(); //Top-Casting -> Child class object can be referred by parent reference variable
						  //This is called Dynamic Polymorphism or Run-time polymorphism.
		c1.start(); //method overriding. child class method i.e BMW's method "start" will be called
		c1.stop();
		c1.refuel();
		c1.engine();
		
		//Down-Casting
		//BMW b1=(BMW)new Car(); //This will give ClassCastException during run-time.
	}

}
