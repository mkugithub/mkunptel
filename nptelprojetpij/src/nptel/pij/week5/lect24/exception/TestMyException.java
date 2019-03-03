package nptel.pij.week5.lect24.exception;

class MyException extends Exception{
	public MyException(String message) {
	super(message);
	}
}



public class TestMyException {

	public static void main(String[] args) {
      int x=5,y=1000;
      try{
    	  
    	  float z=(float)x/(float)y;
    	  if(z<0.01)
    		  throw new MyException("Given data are not proper");
    	  
      }
      catch(MyException e){
    	  System.out.println(e.getMessage());
      }
      finally{
    	  System.out.println("It prints always");
    	  
      }

	}

}
