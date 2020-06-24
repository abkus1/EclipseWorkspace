package OOPConceptsPart1;

public class Functions {
	//main method --> starting point of execution
	//return type of main method is always void because it never returns any value. 
	public static void main(String[] args) {
		Functions obj=new Functions(); 
		//Above statement creates an object 'Functions' with 'obj' as its object reference variable.
		//After creating the object a copy of all non-static methods is given to this object.
		
		obj.test();
		System.out.println();
		
		int l=obj.pqr();
		System.out.println(l);
		System.out.println();
		
		String s1=obj.qa();
		System.out.println(s1);
		System.out.println();
		
		int d1=obj.division(10,2);
		System.out.println(d1);
		
	}
	
	//non static methods
	
	//return type = void
	//no input no output 
	public void test() {
		System.out.println("Test method");
	}
	
	//return type = int
	//no input some output
	public int pqr() {
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	//return type = String
	//no input some output
	public String qa() {
		System.out.println("qa method");
		String s="Selenium";
		return s;
	}
	
	//return type is integer
	//x,y--> input parameters/arguments
	//some input some output
	public int division(int x, int y) {
		System.out.println("division method");
		int d=x/y;
		return d;
	}
}

