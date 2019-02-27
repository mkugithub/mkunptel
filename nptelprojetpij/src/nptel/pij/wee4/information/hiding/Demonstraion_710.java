package nptel.pij.wee4.information.hiding;

class A3{
	protected int rollNo =201;
	protected void msg(){
		System.out.println("In class A3 hello java: "+rollNo);
	}
	
}

public class Demonstraion_710 {

	public static void main(String[] args) {
		A3 obj=new A3();
		obj.msg();
		//obj.rollNo=200;
		
		System.out.println("In class main hello java: "+obj.rollNo);	

	}

}
