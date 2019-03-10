package nptel.pij.week6.lect29.multithreading;

public class A extends Thread {
	
	public void run(){
		System.out.println("Thread A started");
		for(int i=0;i<=4;i++){
			System.out.println("\t From ThreadA: i= " +i);
		}
		System.out.println("Exit from Thread A");
	}
	

}
