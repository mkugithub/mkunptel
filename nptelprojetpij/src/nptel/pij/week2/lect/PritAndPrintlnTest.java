package nptel.pij.week2.lect;

public class PritAndPrintlnTest {

	public static void main(String args[]){
		
		PritAndPrintlnTest test=new PritAndPrintlnTest();
		test.start();
	}
	
	void start()
	{
		int a=4;
		int b=5;
		System.out.print("" +8 +3 +"");
		System.out.print(a+b);
		System.out.print(" " +a + b+ "");
		System.out.print(foo() +a + b+ " ");
		System.out.println(a+ b + foo());
	}
		String foo()
		{
			return "foo";
		}
	}
	
	

