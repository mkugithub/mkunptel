package nptel.pij.week5.lect22.myinterface;

class C{
	protected int i=1000;
	void print(){
		System.out.println("I am from C" +i);
	}
	
}

interface D{
	int j=555;
	void printInterfaceD();
	
}

interface E{
	int k=666;
	void printInterfaceE();
}

class F extends C implements E,D{
 public int aValue=999;	
	
	public void printInterfaceD() {
	System.out.println("I am from D" +j);
		
	}

	
	public void printInterfaceE() {
		System.out.println("I am from E" +k);
		
	}
	
	public void printF(){
		super.print();
		printInterfaceD();
		printInterfaceE();
	}
	
}


public class Demonstration_99 {

	public static void main(String[] args) {
		F fObject=new F();
		fObject.printF();

	}

}
