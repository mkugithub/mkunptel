package nptel.pij.week6.lect29.multithreading;

public class C extends Thread {

	public void run(){
		System.out.println("Thread C started");
		for(int i=0;i<=4;i++){
			System.out.println("\t From Thread C: i= " +i);
		}
		System.out.println("Exit from Thread C");
	}
	
}
