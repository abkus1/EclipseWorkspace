package JavaBasics;

public class B extends A {

	public B() {
		super(10);
		System.out.println("Child class construct");
	}

	public static void main(String[] args) {
		B obj = new B();
	}

}
