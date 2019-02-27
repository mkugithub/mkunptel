package nptel.pij.week3.inheritance.lect13;
//Inheritance example: initializing through constructor
public class Box {
	double width;
	double height;
	double depth;
	
	Box(){ //Default constructor initialized with default values
		width=0.0;
		 height=0.0;
		 depth=0.0;
		
	}
	Box(double w, double h, double d){
		width=w;
		 height=h;
		 depth=d;
		
	}
	
	double volume(){
		return width*height*depth;
	}

}


//BoxWeight is extended with Box
class BoxWeight extends Box
{
	double weight;//Weight of the box
	
//Constructor of BoxWeight
	 BoxWeight() {//default constructor
		super(); //Call the default constructor in the super class
		weight=0.0;
	}
	
	BoxWeight(double w, double h, double d,double m){
		super(w,h,d);//Call the overloaded constructor in the super class
		weight=m;
	}
	
}

class Demonstration_62{
	public static void main(String [] args){
     
		Box myBox1=new Box(10,20,15);
		BoxWeight myBox2=new BoxWeight(2,3,4, 0.076);
		double vol;
		vol=myBox1.volume();
		System.out.println("Volume of my box1 is: " +vol);
		//System.out.println("Weight of my box1 is: " +myBox1.weight);
		System.out.println();
	
		vol=myBox2.volume();
		System.out.println("Volume of myBox2 is: " +vol);
		//System.out.println("Weight of my box2 is: " +myBox2.weight);
	
	}
	
}