package npet.pij.week3.demo;


class A{
	static int x=100;
	private int y=1001;
	A(){
		x++;
		System.out.println(x);
		
	}
	
}

public class AssignmentQues4 extends A {

	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		AssignmentQues4 test=new AssignmentQues4();

	}

}
