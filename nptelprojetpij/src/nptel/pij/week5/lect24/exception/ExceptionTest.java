package nptel.pij.week5.lect24.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try{
		int num=Integer.parseInt("Two thousnds ninteen");
		System.out.println(num);
		}
		catch(NumberFormatException nfe){
			System.out.println("You don`t have number");
		}
		catch(Exception e){
			System.out.println("Something terribly went worng!!!");
		}
		finally{
			System.out.println("Program in execution!!!");
		}
		

	}

}
