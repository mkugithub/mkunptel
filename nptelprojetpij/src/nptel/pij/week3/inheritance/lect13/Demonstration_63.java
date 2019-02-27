package nptel.pij.week3.inheritance.lect13;

//Example of super class variable referring to a subclass object
 class Box1 {
	double width;
	double height;
	double depth;
	
	Box1(){ //Default constructor initialized with default values
		width=0.0;
		 height=0.0;
		 depth=0.0;
		
	}
	Box1(double w, double h, double d){
		width=w;
		 height=h;
		 depth=d;
		
	}
	
	double volume(){
		return width*height*depth;
	}

}


//BoxWeight is extended with Box
class BoxWeight1 extends Box1
{
	double weight;//Weight of the box
	
//Constructor of BoxWeight
	 BoxWeight1() {//default constructor
		super(); //Call the default constructor in the super class
		weight=0.0;
	}
	
	BoxWeight1(double w, double h, double d,double m){
		super(w,h,d);//Call the overloaded constructor in the super class
		weight=m;
	}
	
}


public class Demonstration_63 {

	public static void main(String[] args) {
		Box1 plainBox=new Box1(10,20,15);
		BoxWeight1 weightbox=new BoxWeight1(2,3,4, 0.076);
		double vol;
		vol=weightbox.volume();
		System.out.println("Volume of weightbox is: " +vol);
		System.out.println("Weight of weightbox is: " +weightbox.weight);
		System.out.println();
	
		//Assign BoxWeight reference to Box reference
		plainBox=weightbox;
		vol=plainBox.volume();
		System.out.println("Volume of plainBox is: " +vol);
		//System.out.println("Weight of my plainBox is: " +plainBox.weight);

	}

}
