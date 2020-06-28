package OOPConceptsPart2;

public class HSBCBank implements USBank, BrazilBank {//This is called multiple inheritance. This can achieved only by using interface.
	//This is called Has-a relationship.
	
	//If a class is implementing an interface, then it is mandatory to define/override all the methods of the interface.
	
	//First three methods overriding from USBank
	public void credit() {
		System.out.println("HSBC----credit");
	}
	public void debit() {
		System.out.println("HSBC----debit");	
	}
	public void transferMoney() {
		System.out.println("HSBC----transferMoney");
	}
	
	//Methods of HSBCBank class
	public void eduLoan() {
		System.out.println("HSBC----eduLoan");
	}
	public void carLoan() {
		System.out.println("HSBC----carLoan");
	}
	
	//Method from BrazilBank. Overriding from BrazilBank
	public void mutualFund() {
		System.out.println("HSBC----mutualFund");
	}

}
