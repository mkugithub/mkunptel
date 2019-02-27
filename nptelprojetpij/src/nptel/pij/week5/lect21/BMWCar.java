package nptel.pij.week5.lect21;

import java.io.Serializable;

class BMWCar implements Serializable {
	
	private String make;
	private String model;
	private double price;
	 public BMWCar(){
	  }

	 public BMWCar(String make,String model, double price){
		 this.make=make;
		 this.model=model;
		 this.price=price;
 
	 }


}

