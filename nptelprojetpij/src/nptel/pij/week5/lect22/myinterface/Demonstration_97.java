package nptel.pij.week5.lect22.myinterface;

interface I2{
	double x=4.444;
	void methodI2();//public by default
}

interface I3 extends I2{
	double y=5.555;
	void methodI3();//public by default
}


class A2 implements I3{

	public int a2=555;
		
	public void methodI2() {
		System.out.println("From I2 :" + x+y);
		
	}
	
	public void methodI3() {
		System.out.println("From I3 :" + x+y);
		
	}
	
}


public class Demonstration_97 {

	public static void main(String[] args) {
	
		A2 a2=new A2();
		a2.methodI2();
		a2.methodI3();

	}

}
