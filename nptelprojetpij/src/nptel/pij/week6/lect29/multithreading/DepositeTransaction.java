package nptel.pij.week6.lect29.multithreading;
//Class to implement a thread for deposite

public class DepositeTransaction implements Runnable {

	Account accountX;
	int amount;
	public DepositeTransaction(Account x, int amount) {
		this.accountX=x;
		this.amount=amount;
		new Thread(this).start();
	
	}

	@Override
	public void run() {
		
		accountX.deposite(amount);
		
	}

}
