package nptel.pij.week3.inheritance.lect13;

//A simple abstract class example
abstract class Base{
	abstract void fun();
}

class Derived extends Base{

	void fun(){
		System.out.println("Derived fun method is called");
	}
	
}

public class Demonstration_68 {

	public static void main(String[] args) {
		
	//	Base b=new Base();
    Base b=new Derived();
    b.fun();
		
	}

}
