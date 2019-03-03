package nptel.pij.week3.inheritance.lect13;

public class Bike {
    int gear=5;
	void run() {
		System.out.println("Bike running");
	}

}

class MotorBike extends Bike{{
	MotorBike mb=new MotorBike();
	System.out.println("Accessing geer from moterbike "+ mb.gear);
	
}

class ThunderBro extends MotorBike{
	
	ThunderBro tb=new ThunderBro();	

	
}
	
}

class Splendor extends Bike {
 // private int gear=4;
	void run() {
		System.out.println("Splender running safely at 60KLH");
	}

	public static void main(String[] args) {

		Splendor spbike = new Splendor();
		spbike.run();
		System.out.println("Gears in splender are: "+spbike.gear);
		Bike bike = new Bike();
		bike.run();
		Bike b = new Splendor();// Up casting
		b.run();
		System.out.println("Gears in bikes are: "+spbike.gear);
		

	}

}
