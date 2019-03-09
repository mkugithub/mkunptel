package nptel.pij.week6.lect29.multithreading;

 class ThreadC extends Thread {
	public void run(){
		for(int k=0;k<=5;k++){
			System.out.println("From thread C with i =" +2*(k-1));
		}
		System.out.println("Exiting from thread C...");
	}

}



public class MainThreadClass {

	public static void main(String[] args) {
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
		ThreadC c=new ThreadC();
		a.start();
		b.start();
		c.start();
		
		System.out.println("Multithreading is over...");
		
		
	}

}
