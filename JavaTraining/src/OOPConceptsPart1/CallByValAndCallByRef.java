package OOPConceptsPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		System.out.println("Call by value");
		CallByValAndCallByRef obj=new CallByValAndCallByRef();
		int x=10;
		int y=20;
		System.out.println("In main method Before swapping x = " + x + " and y = " + y);
		obj.swap1(x, y); //call by value or pass by value
		System.out.println("In main method After swapping x = " + x + " and y = " + y);
		System.out.println();
		
		System.out.println("Call by reference");
		obj.p=50;
		obj.q=60;
		System.out.println("In main method Before swapping p = " + obj.p + " and q = " + obj.q);
		obj.swap2(obj);//Call by reference
		System.out.println("In main method After swapping p = " + obj.p + " and q = " + obj.q);
		
	}
	
	public void swap1(int a, int b) {
		
		System.out.println("In method swap1");
		System.out.println("Before swapping a = " + a + " and b = " + b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping a = " + a + " and b = " + b);
	}
	
	public void swap2(CallByValAndCallByRef t) {
		
		System.out.println("In method swap2");
		System.out.println("Before swapping p = " + t.p + " and q = " + t.q);
		int temp=t.p;
		t.p=t.q;
		t.q=temp;
		System.out.println("After swapping p = " + t.p + " and q = " + t.q);
		
	}

}
