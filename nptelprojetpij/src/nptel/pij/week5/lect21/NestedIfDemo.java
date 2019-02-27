package nptel.pij.week5.lect21;

class A{
	
	public interface NestedIf{
		boolean isNotNegative(int n);
	}
}


class B implements A.NestedIf{

	@Override
	public boolean isNotNegative(int n) {
		return n<0?false:true;
	}
	
}

public class NestedIfDemo {

	public static void main(String[] args) {
	 A.NestedIf nif=new B();
	 if(nif.isNotNegative(10)){
		 System.out.println("This is not negative");
	 }

	 if(nif.isNotNegative(-10)){
		 System.out.println("This is negative");
	 }
	}

}
