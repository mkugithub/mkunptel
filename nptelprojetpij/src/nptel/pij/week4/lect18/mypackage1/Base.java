package nptel.pij.week4.lect18.mypackage1;

public class Base {
	
	public void show(){
		System.out.println("Base class show has called");
	}

}

class Derived extends Base{
	public void show(){
		System.out.println("Derived class show() has called");
		
	}
	
}

class Main{
	public static void main(String []args){
		Base bb=new Derived();
		bb.show();
	}
	
}
