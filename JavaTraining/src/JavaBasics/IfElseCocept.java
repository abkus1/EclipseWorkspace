package JavaBasics;

public class IfElseCocept {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		// logic to find greatest among three numbers
		int a1 = 100;
		int b1 = 200;
		int c1 = 400;

		// nested if-else
		if (a1 > b1 & a1 > c1) {
			System.out.println("a1 is the greatest");
		} else if (b1 > c1) {
			System.out.println("b1 is the greatest");
		} else {
			System.out.println("c1 is the greatest");
		}

	}

}
