package nptel.pij.week6.lect29.multithreading;

//Use of yeild(),sleep() and stop() methods

class ClassA extends Thread{
	
	public void run(){
		System.out.println("Start thread A...");
		for(int i=1;i<=5;i++){
			if(i==1){
				yield();
				System.out.println("From thread A: i = " +i);
			}
		}
		System.out.println(" Exiting From thread A ...");
	}

}

class ClassB extends Thread{
	
	public void run(){
		System.out.println("Start thread B...");
		for(int j=1;j<=5;j++){
			if(j==2){
				stop();
				System.out.println("From thread B: j = " +j);
			}
		}
		System.out.println(" Exiting From thread B ...");
	}

}

class ClassC extends Thread {

	public void run() {
		System.out.println("Start thread C...");
		for (int k = 1; k <= 5; k++) {
			System.out.println("From thread C: k = " + k);
			if (k == 3) {
				try {
					sleep(1000);
				} catch (Exception e) {
				}

				System.out.println(" Exiting From thread C ...");
			}
		}
	}
}

