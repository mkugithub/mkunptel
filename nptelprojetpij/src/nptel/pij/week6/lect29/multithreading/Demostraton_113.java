package nptel.pij.week6.lect29.multithreading;

//Demostraton of thread class getId() method:

class ThreadIdTest extends Thread{
	public void run(){
		try{
			//Display the id of thread currently running.
			System.out.println("Thread :"+ Thread.currentThread().getId()+" :is running");
		}catch(Exception e){
			System.out.println("Excepiton is caught");
		}
	}
}

public class Demostraton_113 {

	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<8;i++){
			ThreadIdTest obj=new ThreadIdTest();
			obj.start();
		}

	}

}
