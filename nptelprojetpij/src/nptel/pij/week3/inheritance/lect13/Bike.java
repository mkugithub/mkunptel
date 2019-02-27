package nptel.pij.week3.inheritance.lect13;

public class Bike {

	void run() {
		System.out.println("Bike running");
	}

}

class Splendor extends Bike {
	void run() {
		System.out.println("Splender running safely at 60KLH");
	}

	public static void main(String[] args) {

		Splendor spbike = new Splendor();
		spbike.run();
		Bike bike = new Bike();
		bike.run();
		Bike b = new Splendor();// Up casting
		b.run();

	}

}
