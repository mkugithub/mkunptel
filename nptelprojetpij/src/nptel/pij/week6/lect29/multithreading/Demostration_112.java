package nptel.pij.week6.lect29.multithreading;

class Thread5 implements Runnable{
	
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println("From thread 5 with i ="+-1*i);
		}
		System.out.println("Exiting from thread 5 ....");
	}
}

class Thread6 implements Runnable{
	
	public void run(){
		for(int j=0;j<=5;j++){
			System.out.println("From thread 6 with i ="+2*j);
		}
		System.out.println("Exiting from thread 6...");
	}
}

class Thread7 implements Runnable{
	
	public void run(){
		for(int k=0;k<=5;k++){
			System.out.println("From thread 7 with k ="+(2*k-1));
		}
		System.out.println("Exiting from thread 7....");
	}
}



public class Demostration_112 {
	public static void main(String[] args) {

		Thread5 one=new Thread5();
		Thread t1 =new Thread(one);
		
		Thread6 two=new Thread6();
		Thread t2 =new Thread(two);
		
		Thread7 three=new Thread7();
		Thread t3 =new Thread(three);
	
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Multithreading is orver...");
	}

}
