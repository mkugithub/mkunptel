package nptel.pij.wee4.information.hiding;

 class A{
	 int data=100;
	 void msg(){
		System.out.println("Inside A");
	}
}


public class B extends A {

	public static void main(String[] args) {
   int data=100;
		A a =new A();
		B b =new B();
		System.out.println(a.data); //Compilation error becuase we are trying to access the private member of class A
		a.msg();
		b.msg();

	}

}
