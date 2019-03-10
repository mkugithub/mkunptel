package nptel.pij.week6.multithreading.assignment;

class ThreadA extends Thread{
	public void run(){
		System.out.println("Hi I am therad A");
	}
	
}

public class ThreadMethodTest {
	
	public static void main(String[] args) {
   
		ThreadA a=new ThreadA();
		System.out.println("Thread Status before start " +a.getState().toString());
         
		a.start();
		System.out.println("Thread status after start is called "+a.getState().toString());
		
		/*a.suspend();
		System.out.println("Thead state after suspend " +a.getState().toString());
		
		a.resume();
		System.out.println("Thead state after resumed is called " +a.getState().toString());
*/		
		try {
			System.out.println("Thread Status before wait is called " +a.getState().toString());
			a.wait();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
