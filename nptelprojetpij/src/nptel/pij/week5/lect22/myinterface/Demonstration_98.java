package nptel.pij.week5.lect22.myinterface;

interface I5{
	int i=123;
	void printI3();
	
}

interface I4{
	public static int j=555;
	void printI4();
	
}

class A3 implements I5,I4{

	public int aValue=999;
	
	public void printI4() {
		
		System.out.println("I am from I4 :" +j);
	}
	
	public void printI3() {
		
		System.out.println("I am from I3 :" +i);
	}
	
	public void printA3(){
		System.out.println("I am from A3 :" +(aValue=i+j));
	}
	
}

public class Demonstration_98 {

	public static void main(String[] args) {
		A3 a3=new A3();
		a3.printA3();
		a3.printI3();
		a3.printI4();

	}

}
