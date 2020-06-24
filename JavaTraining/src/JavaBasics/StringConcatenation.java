package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// "+" is called the concatenation operator
		int a = 100;
		int b = 200;
		double c = 12.33;
		double d = 10.33;
		
		String x = "Hello";
		String y = "World";
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(c+d);
		System.out.println(x+y+c+d);

	}

}
