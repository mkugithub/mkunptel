package npet.pij.week3.demo;

public class DemoSwitch_56 {

	public static void main(String[] args) {
     int num=7;
     boolean isPrime=true;
    // num=Integer.parseInt(args[0]);
     for(int i=2;i<num/2;i++){
    	 
    	 if((num%i)==0){
    		 if(isPrime){
    			 isPrime=false;
    			 break;
    		 }
    		 
    	 }
    	 
    	 
     }

	 if(isPrime)
		 System.out.println("Num is prime");
	 else
		 System.out.println("Not prime");
     

	}

}
