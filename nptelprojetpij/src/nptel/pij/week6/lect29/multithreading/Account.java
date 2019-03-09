package nptel.pij.week6.lect29.multithreading;

public class Account {
    public int balance;
    public int accountNo;
    
    public Account(){}
    
    
    
    public void diplayBalance(){
      System.out.println("Account No : " + accountNo+ "Balance :" +balance);
    	
    }
	
     void deposite(int amount){
    	  balance=balance+amount;
    	  System.out.println("Amount deposited  :" + amount);
    	  diplayBalance();
      }
    
      void withdraw(int amount){
    	  balance=balance-amount;
    	  System.out.println("Amount withdrawn  :" + amount);
    	  diplayBalance();
      }
	
	
}
