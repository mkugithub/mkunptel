package nptel.pij.week6.lect29.multithreading;

class ThreadD implements Runnable {
	public void run(){
		for(int k=0;k<=5;k++){
			System.out.println("From thread Z with i =" +2*(k-1));
		}
		System.out.println("Exiting from thread Z...");
	}

}


public class MultiThreadRunnable {

	public static void main(String[] args) {
		ThreadX x =new ThreadX();
		Thread t1=new Thread(x);
		ThreadY y=new ThreadY();
		Thread t2 =new Thread(y);
		Thread t3 = new Thread(new ThreadZ());
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("... Multithreading is over....");

	}

}
