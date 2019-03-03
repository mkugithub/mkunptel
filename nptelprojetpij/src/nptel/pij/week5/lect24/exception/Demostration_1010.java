package nptel.pij.week5.lect24.exception;

public class Demostration_1010 {

	public static void main(String[] args) throws Exception {
		int array []=new int [3];
		try{
		for(int i=0;i<4;i++){
			array[i]=i;
		}
		System.out.println(array);
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("fillIn :" +e.fillInStackTrace());
			System.out.println("cause :" +e.getCause());
			System.out.println("localized Message :" +e.getLocalizedMessage());
			System.out.println("meassage :" +e.getMessage());
			System.out.println("trace :" +e.getStackTrace());
			System.out.println();
			System.out.println();
			System.out.println("Print stack Trace");
			e.printStackTrace();
			System.out.println("Print toString");
			e.toString();
			System.out.println();
			System.out.println();
			
			//Print just to informed that you have entered the catach block
			System.out.println("Oops, we went so far , better to go back 0!!");
			throw(Exception) new Exception().initCause(e);
		
		}
		
		finally {
			System.out.println(array);
		}
	}

}
