package nptel.pij.week6.lect29.multithreading;

public class ThreadA extends Thread {
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println("From thread A with i =" +-1*i);
		}
		System.out.println("Exiting from thread A");
	}

}


 class ThreadB extends Thread {
	public void run(){
		for(int j=0;j<=5;j++){
			System.out.println("From thread B with i =" +2*j);
		}
		System.out.println("Exiting from thread B...");
	}

}
