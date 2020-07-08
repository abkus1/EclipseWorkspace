package JavaBasics;

public class SingletonConcept {

	// A singleton class is a class that can have only one object (instance of class) at a time.
	// How to design a singleton class:
	// 1.Make constructor as private.
	// 2.Write a public static method (getInstance) that has the return type of object of this singleton class. This is called Lazy Initialization.

	private static SingletonConcept singleton_instance = null;
	public String str;

	private SingletonConcept() {
		str = "Hey I am using singleton class pattern";
	}

	public static SingletonConcept getInstance() {
		if (singleton_instance == null)
			singleton_instance = new SingletonConcept();
		return singleton_instance;
	}

	public static void main(String[] args) {
		SingletonConcept x = SingletonConcept.getInstance();
		SingletonConcept y = SingletonConcept.getInstance();
		SingletonConcept z = SingletonConcept.getInstance();

		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}
