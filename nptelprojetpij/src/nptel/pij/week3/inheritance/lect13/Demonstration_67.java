package nptel.pij.week3.inheritance.lect13;

//Inheritance example: initializing through constructor
 class Box2 {
	double width;
	double height;
	double depth;
	
	Box2(){ //Default constructor initialized with default values
		width=0.0;
		 height=0.0;
		 depth=0.0;
		
	}
	Box2(double w, double h, double d){
		width=w;
		 height=h;
		 depth=d;
		
	}
	
	double volume(){
		return width*height*depth;
	}

}

//BoxWeight is extended with Box
class BoxWeight2 extends Box
{
	double weight;//Weight of the box
	
//Constructor of BoxWeight
	 BoxWeight2() {//default constructor
		super(); //Call the default constructor in the super class
		weight=0.0;
	}
	
	BoxWeight2(double w, double h, double d,double m){
		super(w,h,d);//Call the overloaded constructor in the super class
		weight=m;
	}
	
}

class Shipment extends BoxWeight2{
 double cost; //Added shipping cost.
 Shipment(double w,double h,double d,double m,double c){
	 super(w,h,d,m);//will the super class constructor
	 cost=c;
 }
 
	
}

public class Demonstration_67 {

	public static void main(String[] args) {
	Shipment shipment1=new Shipment(10, 20, 15, 10, 3.14);
	Shipment shipment2=new Shipment(2, 3, 4, 5, 1.28);
	double vol;
	vol=shipment1.volume();
	System.out.println("Volume of shipment 1 is: " +vol);
	System.out.println("Weight of shipment 1 is: " +shipment1.weight);
	System.out.println("Cost of shipment 1 is: " +shipment1.cost);
	
	System.out.println();
	
	vol=shipment2.volume();
	System.out.println("Volume of shipment 2 is: " +vol);
	System.out.println("Weight of shipment 2 is: " +shipment2.weight);
	System.out.println("Cost of shipment 2 is: " +shipment2.cost);

	}

}
