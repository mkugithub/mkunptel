package nptel.pij.week6.lect29.multithreading;

public class Demostration_118 extends Thread{

	public static int x;
	public void run(){
		for(int i=0;i<100;i++){
			x=x+1;
			x=x-1;	
		}
		
	}
	
	public static void main(String[] args) {
		int x=0;
		for(int i=0;i<1000;i++){
			new Demostration_118().start();
			
		}
		System.out.println(x);
	}

}
