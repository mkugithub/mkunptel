package nptel.pij.week6.lect29.multithreading;

public class B extends Thread {
	
	public void run(){
		System.out.println("Thread B started");
		for(int i=0;i<=4;i++){
			System.out.println("\t From Thread B: i= " +i);
		}
		System.out.println("Exit from Thread B");
	}

}
