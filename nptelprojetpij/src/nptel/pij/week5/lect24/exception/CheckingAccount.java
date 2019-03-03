package nptel.pij.week5.lect24.exception;

public class CheckingAccount {
	private double balance;
	private int number;

	
	public int getNumber() {
		return number;
	}

	
	public double getBalance() {
		return balance;
	}

		
	public CheckingAccount(int number){
		this.number=number;
	}

	public void deposit(double amount){
		balance =+amount;
	}
	
	public void withdraw(double amount) throws InsufficientFundException{
		if(amount<=balance){
			balance-=amount;
		}
		else{
			double needs=amount-balance;
			throw new InsufficientFundException(needs);
		}
	}
	
	
}
