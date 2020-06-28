package OOPConceptsPart2;

public interface USBank {
	
	//Properties of interface:
	//Only method declaration.
	//No method body --> only method prototype.
	//Variables can be declared in Interface and by default, they are static and final in nature.
	//Value of the variables will not change.
	//No static methods are allowed in an Interface. This is because Interface is a part of object and objects cannot have static methods.
	//No main method in Interface.
	//We cannot create an object of the Interface i.e Interface is abstract in nature.
	
	int min_bal=100;
	public void credit();
	public void debit();
	public void transferMoney();

}
