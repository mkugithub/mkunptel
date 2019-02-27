package nptel.pij.wee4.information.hiding;

//Example of method overriding
class A5{
public void msg1(){
		
		System.out.println("In msg1 of class A5");
		
	}
protected void msg2(){
		
		System.out.println("In msg2 of class A5");
		
	}

private void msg3(){
	
	System.out.println("In msg3 of class A5");
	
}

}



public class Demonstration_716 extends A4 {

	
	
	 void msg1(){
		
		System.out.println("In msg1 of class A5");
		
	}
 private void msg2(){
		
		System.out.println("In msg2 of class A5");
		
	}

  private void msg3(){
	
	System.out.println("In msg3 of class A5");
	
}

	
	
	public static void main(String[] args) {
//		void msg(){
//			System.out.println("Welcome in main class");
//		}
		
		}

}
