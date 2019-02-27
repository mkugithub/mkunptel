package nptel.pij.week5.lect21;

public class Car implements Cloneable {
	private String make;
	private String model;
	private double price;
	 public Car(){
	  }

	 public Car(String make,String model, double price){
		 this.make=make;
		 this.model=model;
		 this.price=price;
 
	 }
	 
	 public Object clone(){//Cloneable interface
		 return new Car(this.make,this.model, this.price);
	 }
}
