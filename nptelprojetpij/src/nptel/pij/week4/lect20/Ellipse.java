package nptel.pij.week4.lect20;

public class Ellipse extends Geometry {
   protected double a,b;
   public Ellipse(){
	   a=0.0;
	   b=0.0;		   
   }
   public Ellipse(double a,double b){
	   this.a=a;
	   this.b=b;
   }
	
	@Override
	public double area() {
		
		return PI *a *b;
	}

	@Override
	public double circumference() {
		
		return PI*(a+b) ;
	}
	
	public double getMinorAxis(){
		return a;
	}

	public double getMajorAxis(){
		return b;
	}
}
