package OOPConceptsPart2;

public class BMW extends Car{ //IS-a relationship
	
	//When the same method is present in parent as well as the child class with same name & number of
	//arguments, it is called method overriding. Preference is always given to overridden method.
	
	public void start() {//Overriding method
		System.out.println("BMW----Start");
	}
	
	public void theftSaftey() {
		System.out.println("BMW----theftSaftey");
	}

}
