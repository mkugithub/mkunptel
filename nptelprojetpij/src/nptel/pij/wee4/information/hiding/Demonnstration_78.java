package nptel.pij.wee4.information.hiding;


class A2{
	private int data =40;
	public void msg(){
		System.out.println("Class A: Hellow Java: " +data);
	}
}

public class Demonnstration_78 {

	public static void main(String[] args) {
		//private int data2=100;
		//public int data2=100;//Only default modifier is allowed inside the public method
		int data2=100;
		A2 obj=new A2();
		System.out.println("In main Class " +data2);
		obj.msg();//private data can be access through public method
	}

}
