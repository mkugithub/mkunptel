package nptel.pij.week6.lect29.multithreading;

public class Demonstraton_115 {

	public static void main(String[] args) {
		ClassA t1=new ClassA();
		ClassB t2=new ClassB();
		ClassC t3=new ClassC();
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Multithreading is over");
	}

}
