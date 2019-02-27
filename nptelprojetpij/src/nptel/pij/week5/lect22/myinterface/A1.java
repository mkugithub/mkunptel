package nptel.pij.week5.lect22.myinterface;

interface I1 {
	public static final double PI = 3.14; // OK
	static final double lambda = 0.04;// OK, public is implicit
	// int x;//Declaratioin of any instance variable is NOT allowed
	int x = 100;// Initialization of variable in interface is necessary
	// private static final int p=444;//private/protected are not allowed in
	// interface declaration
	// abstract public static void methodI1()//Static method is not allowed

	void methodI2();// public abstract by default

}

class A1 implements I1 {

	public int a1 = 555;

	public void methodI1() {
		System.out.println("From I1 " + PI);
	}

	public void methodI2() {
		System.out.println(" Again From I1 " + lambda);
	}

}
