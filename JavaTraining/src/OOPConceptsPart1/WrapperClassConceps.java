package OOPConceptsPart1;

public class WrapperClassConceps {
	
	//Wrapper classes are used to convert primitive data-types into their corresponding objects.
	//This is useful while working with collections as they use only objects and not primitive 
	//data-types.
	//primitive data-types are--> int, char, double, float, boolean etc..

	public static void main(String[] args) {
		String x="100";
		System.out.println(x+20);
		
		//data-type conversion from string to int
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//string to double
		double d=Double.parseDouble(x);
		System.out.println(d+12.33);
		
		//string to boolean
		String b="true";
		boolean b1=Boolean.parseBoolean(b);
		System.out.println(b1);
		
		//int to string coversion
		int a=200;
		System.out.println(a+20);
		String s=String.valueOf(a); //"200"
		System.out.println(s+20);
		
		//NumberFormatException
		String u="100A";
		Integer.parseInt(u); //This will result into a number format exception because the string
		//u has a value 100A which is not purely numerical and hence cannot be converted into an int.
	}

}
