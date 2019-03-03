package nptel.pij.week5.lect24.exception;

public class InsufficientFundException extends Exception {
    double amount;
    public InsufficientFundException(double amt){
    	this.amount=amt;
    }
	
    public double getAmount(){
    	return amount;
    }
	
}
