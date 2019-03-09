package nptel.pij.week6.lect29.multithreading;

public class WithdrawTransaction  implements Runnable{

	Account accountY;
	int amount;
	
	public WithdrawTransaction(Account accountY, int amount){
		this.accountY=accountY;
		this.amount=amount;
		new Thread(this).start();
	}
	
	
	@Override
	public void run() {
		accountY.withdraw(amount);
		
	}

}
