package JavaBasics;

public class LoopConcept {

	public static void main(String[] args) {
		// 1. while Loop
		// will generate infinite loop if increment/decrement is not provided
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i = i + 1;
		}

		// 2. for Loop
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}

	}

}
