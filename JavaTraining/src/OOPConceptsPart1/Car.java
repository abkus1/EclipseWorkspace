package OOPConceptsPart1;

public class Car {
	
	// class or global variables
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		// new Car(); --> this is the object of the Class 'Car'.
		// a,b,c --> these are the object reference variables.
		// new keyword is used to create the object
		
		Car a=new Car(); //creating object 'a' of the class Car
		Car b=new Car();
		Car c=new Car();
		
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2014;
		b.wheel=4;
		
		c.mod=2013;
		c.wheel=4;
		
		System.out.println("Before assigning references");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println();
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println();
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		System.out.println();
		
		System.out.println("After assigning refereneces");
		
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod); // the value will be 10
		c.mod=20;
		System.out.println(a.mod); // the value will be 20
		System.out.println(c.mod); // the value will be 20

	}

}
