package nptel.pij.week6.multithreading.assignment;

class Thread1 extends Thread {

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				System.out.print("A");
				System.out.print("B");
			}
		}

	}
}



class Thread2 extends Thread {
    
	//synchronized
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				System.out.print("C");
				System.out.print("D");
			}	
		}
		
	}
}

public class MainThreadTest {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		//t1.setPriority(4);
		//t2.setPriority(7);
		
		System.out.println("Threads State before start:" +t1.getState().toString());
		System.out.println("Threads alivness:" +t1.isAlive());
		t1.start();
		
		System.out.println("Threads State after start:" +t1.getState().toString());
		System.out.println("Threads alivness after:" +t1.isAlive());
		
		t2.start();
		System.out.println("Threads State after start:" +t2.getState().toString());
		System.out.println("Threads alivness after:" +t2.isAlive());
		
	}

}
