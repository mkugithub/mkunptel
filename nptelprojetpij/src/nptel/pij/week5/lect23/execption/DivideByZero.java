package nptel.pij.week5.lect23.execption;

class DivideByZero {

 static int anyFunction(int x,int y){
	 try{
	 int a=x/y;
	
	}
	 catch(ArithmeticException e) {
		 System.out.println("Exception occor while dividing by zero" + y);
	 }
	 return 1;
 }
	
	public static void main(String[] args) {
		 int result=anyFunction(25,0);
		 System.out.println("Result : " +result);
       
	}

}
