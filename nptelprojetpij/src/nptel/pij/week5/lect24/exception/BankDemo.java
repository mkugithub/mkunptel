package nptel.pij.week5.lect24.exception;

public class BankDemo {

	public static void main(String[] args) {
		
		CheckingAccount ca =new CheckingAccount(100);
		System.out.println("Depositing amount $500 ..");
		ca.deposit(500);
     	System.out.println("\n Withdrawing $100 ...");
		try {
			ca.withdraw(100);
			System.out.println("\n Withdrawing $600 ...");
			ca.withdraw(600);
		} catch (InsufficientFundException e) {
			System.out.println("Sorry, you are short $ "+e.amount);
			e.printStackTrace();
		}
	}

}
