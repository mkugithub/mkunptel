package npet.pij.week3.demo;

public class NestedCircle {
	static double x,y,r ;
	NestedCircle(double r){
		this.r=r;
	}
	
	//Following is the nested class
	public static class Point{
		
		double x, y;
		void display(){
			System.out.println("(x,y): (" +this.x + "," +this.y +")");
		}
		
		Point(double a,double b){
			this.x=a;
			this.y=b;
		}
	}
	
	public boolean isInside(Point p){
		double dx=p.x=x;
		double dy=p.y=y;
		double distance=Math.sqrt((dx*dx)+(dy*dy));
		if(distance<r)
			return true;
		else
			return false;
		
	}
	
	public static void main(String [] args){
		NestedCircle a=new NestedCircle(2.0);
		Point pa=new Point(1.0,2.0);
		pa.display();
		System.out.println("Is the point(1,2) inside the cicle with radius 2 :" + a.isInside(pa));
		NestedCircle b=new NestedCircle(1.0);
		Point pb=new Point(3.0,3.0);
		System.out.println("Is the point(3,3) inside the cicle with radius 1 :" + b.isInside(pb));
	}

}
