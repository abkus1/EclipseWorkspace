package OOPConceptsPart1;

public class MethodOverloading {
	
	//It is the process of creating multiple methods with the same name but with different parameters within the same calss
	//The method 'sum' below is an example of method overloading
	//Main method can also be overloaded
	//Same method name with same number arguments but with different data types are allowed

	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(2);
		obj.sum(2, 3);
		
	}
	
	public void sum() {//0 input parameter
		System.out.println("sum method--0 parameter");
	}
	
	public void sum(int i) {//1 input parameter
		System.out.println("sum method--1 parameter");
		System.out.println(i);
	}
	
	public void sum(int j, int k) {//2 input parameter
		System.out.println("sum method--2 parameters");
		System.out.println(j+" and "+k);
	}

}
