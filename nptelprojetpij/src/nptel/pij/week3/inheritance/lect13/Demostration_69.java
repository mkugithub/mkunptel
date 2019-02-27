package nptel.pij.week3.inheritance.lect13;


//A simple abstract class example with constructor
abstract class Base1{
	Base1(){
		System.out.println("Abstract class constructor is called");
	}
	abstract void fun();
}

class Derived1 extends Base1{
	Derived1(){
		super();
		System.out.println("Derived class constructor is called");
		
	}
	void fun(){
		System.out.println("Derived fun method is called");
	}
	
}
public class Demostration_69 {
	
	public static void main(String[] args) {
		
	
	    Derived1 d=new Derived1();
	    d.fun();
			
		}

}
