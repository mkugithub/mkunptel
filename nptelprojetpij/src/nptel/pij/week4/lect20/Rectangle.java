package nptel.pij.week4.lect20;

public class Rectangle extends Geometry{
	protected double l,b;
	
	public Rectangle(){
		
	}
	
public Rectangle(double l,double b){
		this.l=l;
		this.b=b;
	}
	
	
	@Override
	public double area() {
		
		return l*b;
	}

	@Override
	public double circumference() {
		
		return 2*(l+b);
	}

}
