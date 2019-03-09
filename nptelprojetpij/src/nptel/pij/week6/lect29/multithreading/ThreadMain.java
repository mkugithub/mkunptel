package nptel.pij.week6.lect29.multithreading;

public class ThreadMain extends Thread {
	
	public void run(){
		for(int k=0;k<5;k++){
			try{
				System.out.println("Thread before sleep");
				sleep((int)(Math.random()*5000));//sleep for 5 second.
				System.out.println("Thread after sleep");
			}
			catch(InterruptedException e){
                System.out.println(k);				
			}
			
		}
		
	}
	

	public static void main(String[] args) {
		new ThreadMain().start();
		new ThreadMain().start();
		System.out.println("Done");
	}

}
