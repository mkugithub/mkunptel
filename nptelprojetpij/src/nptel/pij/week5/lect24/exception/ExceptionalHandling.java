package nptel.pij.week5.lect24.exception;

public class ExceptionalHandling {

	public static void main(String[] args) {
		
		int a,b;
	try{	
		b=0;
		a=5/b;
     System.out.print("A");
	}
	 catch(ArithmeticException e){
		 System.out.print("B");
	 }
	finally{
		System.out.print("C");
		
	}
	
	}

}
