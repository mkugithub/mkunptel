package nptel.pij.week6.lect29.multithreading;

class Thread1 extends Thread{
	
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println("From thread 1 with i ="+-1*i);
		}
		System.out.println("Exiting from thread1....");
	}
}

class Thread2 extends Thread{
	
	public void run(){
		for(int j=0;j<=5;j++){
			System.out.println("From thread 2 with i ="+2*j);
		}
		System.out.println("Exiting from thread2....");
	}
}

class Thread3 extends Thread{
	
	public void run(){
		for(int k=0;k<=5;k++){
			System.out.println("From thread 3 with k ="+(2*k-1));
		}
		System.out.println("Exiting from thread3....");
	}
}


public class Demonstration_111 {

	public static void main(String[] args) {

		Thread1 one=new Thread1();
		Thread2 two=new Thread2();
		Thread3 three=new Thread3();
	
		one.start();
		two.start();
		three.start();
		
		System.out.println("Multithreading is orver...");
	}

}
