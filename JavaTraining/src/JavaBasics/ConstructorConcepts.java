package JavaBasics;

public class ConstructorConcepts {

	public ConstructorConcepts() {
		System.out.println("Default Constructor");
	}

	public ConstructorConcepts(int i) {
		System.out.println("Single parm constructor");
		System.out.println("The value of i is " + i);
	}

	public ConstructorConcepts(int i, int j) {
		System.out.println("Single parm constructor");
		System.out.println("The value of i is " + i);
		System.out.println("The value of j is " + j);
	}

	public static void main(String[] args) {
		ConstructorConcepts obj = new ConstructorConcepts();
		ConstructorConcepts obj1 = new ConstructorConcepts(10);
		ConstructorConcepts obj3 = new ConstructorConcepts(10, 20);

	}

}
