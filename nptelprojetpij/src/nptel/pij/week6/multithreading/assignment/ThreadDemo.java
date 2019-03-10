package nptel.pij.week6.multithreading.assignment;

public class ThreadDemo implements Runnable {

	String x, y;
	public static void main(String[] args) {
		
		ThreadDemo run=new ThreadDemo();
		Thread t1 =new Thread(run);
		Thread t2=new Thread(run);
	      t1.start();
	      t2.start();
	}

	@Override
	public void run() {
		
		for(int i=0;i<10;i++){
			synchronized (this) {
				x="Hellow";
			    y="Java";
			    System.out.println(x+ " "+ y+ " "); 
			}
		}
		
	}

}
