package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String a[][] = new String [3][5];
		System.out.println(a.length); // this will give total number of rows i.e 3
		System.out.println(a[0].length); // this will give total number of columns i.e 5
		
		// 1st row
		a[0][0] = "A";
		a[0][1] = "B";
		a[0][2] = "C";
		a[0][3] = "D";
		a[0][4] = "E";
		
		//2nd row
		a[1][0] = "F";
		a[1][1] = "G";
		a[1][2] = "H";
		a[1][3] = "I";
		a[1][4] = "J";
		
		//3rd row
		a[2][0] = "K";
		a[2][1] = "L";
		a[2][2] = "M";
		a[2][3] = "N";
		a[2][4] = "O";

		System.out.println(a[1][3]);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
