package nptel.pij.week5.lect24.exception;

public class FinallyTest {

	public static void main(String[] args) {
		int i=0;
		String greetings []={"Hellow Twikel","Hellow Java", "Hello World"};
		 while(i<4)
		 {
			 try{
				 System.out.println(greetings[i++]);
			 }
			 
			 catch(Exception e){
				 System.out.println(e.toString());// Message of exception in string formate
				 
			 }
			 
			 finally{
              System.out.println("You should quit and reset index value <3: ");				 
			 }
		 }

	}

}
