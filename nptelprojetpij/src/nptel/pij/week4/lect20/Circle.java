package nptel.pij.week4.lect20;

public class Circle extends Geometry {
   protected double r;
	public Circle(){
		r=0.0;
	}
	public Circle(double r){
		this.r=r;
	}
	
   
	@Override
	public double area() {
		
		return PI*(r*r);
	}

	@Override
	public double circumference() {
		
		return 2*PI*r;
	}

}
