package nptel.pij.wee4.information.hiding;

public class ClassWithPrivateConstructor {

	 private ClassWithPrivateConstructor (){
		 
	 }
	 
	 void msg(){
		 
		 System.out.println("Inside the private constructor class ");
	 }
}

class Simple{
	public static void main(String [] args){
		//Compilation error due to constructor is private 
		//ClassWithPrivateConstructor test=new ClassWithPrivateConstructor();
	}
}
