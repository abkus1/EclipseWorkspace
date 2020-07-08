package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// Array is group of similar data type values

		// Limitations of array:
		// 1. Size is fixed (Static array)--> To overcome this limitation, we use
		// dynamic array like ArrayList, HashTable
		// 2. Stores only similar data-types--> To overcome this limitation, we use
		// object array

		// below are one dimensional array
		// 1. int array

		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;

		System.out.println(i[0]);
		System.out.println();

		// System.out.println(i[5]); //ArrayIndexOutOfBoundsException

		System.out.println(i.length); // print the size of the array
		System.out.println();

		// print all the values of the array

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		// 2. double array

		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 10.33;
		d[2] = 8.33;

		System.out.println(d[0]);

		// 3. char array

		char c[] = new char[3];
		c[0] = 'q';
		c[1] = '1';
		c[2] = 'A';

		// 4. boolean array

		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;

		// 5. String array

		String s[] = new String[3];
		s[0] = "test";
		s[1] = "hello";
		s[2] = "world";

		// 6. Object array (Object is a class just like String. It can also be called as
		// a superclass
		// of all the classes in java). Object array is used to store values of
		// different data types

		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "24/07/1992";
		ob[4] = 'M';
		ob[5] = "London";

		System.out.println(ob[5]);

	}

}
