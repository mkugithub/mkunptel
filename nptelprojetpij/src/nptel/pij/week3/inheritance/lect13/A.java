package nptel.pij.week3.inheritance.lect13;

/*A simple example of inheritance*/

//Create a super class
public class A {
	int i, j;
	void showij()
	{
		System.out.println("i and j" +i+ " " +j);
	}

}

class B extends A{
	
	int k;
	void showk()
	{
		System.out.println(" K" +k);
	}
	
	void sum(){
		
		System.out.println("i +j+k :" +(i+j+k));
	}
	
}

class Demonstration_61
{
	
	public static void main(String [] args){
		A superObj=new A();
		B subObj=new B();
		//the super class may be used by itself
		superObj.i=10;
		superObj.j=20;
		System.out.println("Content of super class");
		superObj.showij();
		System.out.println();
		//The subclass has access to all public members of superclass
		subObj.i=7;
		subObj.j=8;
		subObj.k=9;
		System.out.println("Contents of sub class");
		subObj.showij();
		subObj.showk();
		System.out.println("Sum of i ,j and k in subclass");
		subObj.sum();
		
		
	}
	
	
	
	
	
}