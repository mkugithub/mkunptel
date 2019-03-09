package nptel.pij.week6.lect29.multithreading;

public class BankingTransaction {

	public static void main(String[] args) {
      Account abc=new Account();
      //create an accoount
      abc.balance=1000;
      abc.accountNo=1234;
      
      DepositeTransaction dt;
      WithdrawTransaction wt;
      
      dt=new DepositeTransaction(abc, 900);
      wt=new WithdrawTransaction(abc,1000);
		
		
	}

}
