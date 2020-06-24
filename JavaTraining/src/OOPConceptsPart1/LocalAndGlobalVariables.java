package OOPConceptsPart1;

public class LocalAndGlobalVariables {
	
	//Global/Class variables
	String name="Tom";
	int age=25;

	public static void main(String[] args) {
		int i=10; //Local variable for method main
		LocalAndGlobalVariables obj = new LocalAndGlobalVariables();
		System.out.println(obj.name); //need to create object in order to access the global variable.
		System.out.println(obj.age);
	}
	
	public void sum() {
		int i=15; //local variable for the method sum
		int j=20; //local variable for the method sum
	}

}
