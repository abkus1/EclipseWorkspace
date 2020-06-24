package OOPConceptsPart1;

public class StaticAndNonStaticConcept {
	
	String name="Tom"; //Non static global variable
	static int age=25; //Static global variable

	public static void main(String[] args) {
		
		//How to call static methods and variables?
		
		//1. Direct calling by name. for eg:
		sum();
		System.out.println(age);
		//2.Calling by ClassName.methodName/ClassName.variableName. eg:
		StaticAndNonStaticConcept.sum();
		System.out.println(StaticAndNonStaticConcept.age); 
		
		//To call sendMail method (which is non static),we need to create an object and use it to call
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		//Can a static object be accessed using object reference? Yes. See the eg. below:
		obj.sum(); //warning will always be given

	}
	
	public void sendMail() {//Non static method
		System.out.println("Send mail method");
	}
	
	public static void sum() {//Static method
		System.out.println("Sum method");
	}

}
