package OOPConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.eduLoan();
		hs.carLoan();
		hs.mutualFund();
		
		System.out.println();
		
		//dynamic polymorphism
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
	}

}
