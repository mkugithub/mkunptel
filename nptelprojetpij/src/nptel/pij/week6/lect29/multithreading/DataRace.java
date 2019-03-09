package nptel.pij.week6.lect29.multithreading;

public class DataRace extends Thread {
	
	static int x;
	public void run(){
		for(int k=0;k<100000;k++){
			x=x+1;
			x=x-1;
			
		}
	}

	public static void main(String[] args) {
		x=0;
		for(int i=0;i<100000;i++){
			new DataRace().start();
		}
      System.out.println(x);		

	}

}
