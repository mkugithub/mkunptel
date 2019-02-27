package nptel.pij.wee4.information.hiding;

//Example-1 of default access modifier

class A1{
	void msg(){
		System.out.println("hi , I m in class A1");
	}
}


public class Demonstration_71 {

	public static void main(String[] args) {
		A1 obj=new A1();
	      obj.msg();	

	}

}
