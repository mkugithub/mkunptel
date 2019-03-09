package nptel.pij.week6.lect29.multithreading;

public class ThreadX implements Runnable {
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println("From thread X with i =" +-1*i);
		}
		System.out.println("Exiting from thread X");
	}

}


 class ThreadY implements Runnable {
	public void run(){
		for(int j=0;j<=5;j++){
			System.out.println("From thread Y with i =" +2*j);
		}
		System.out.println("Exiting from thread Y...");
	}
 }
	
	class ThreadZ implements Runnable {
		public void run(){
			for(int k=0;k<=5;k++){
				System.out.println("From thread Z with i =" +(2*k-1));
			}
			System.out.println("Exiting from thread Z...");
		}

	}
 
