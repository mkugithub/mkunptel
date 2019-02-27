package npet.pij.week3.demo;

//A class method and a instance method
public class Circle {

	public double x,y,r ;
	
	public Circle(double d) {
		
	}

	//All the constructor are here;
	//An the instance method. Return the bigger of the two circle
	public Circle bigger(Circle c){
		if(c.r>r){
			return c;
			
		}
		else
		{
			System.out.println("Value of object in this " + this );
			return this;
		}
	}
	
	//A class method: Return the bigger of two circles.
	
	public static Circle bigger(Circle a, Circle b)
	{
		if(a.r>b.r) return a;
		else return b;
	}
	
	public static void main(String [] args)
	{
		Circle a =new Circle(2.0);
		Circle b =new Circle(3.0);
		Circle c =a.bigger(b);//Call the instance method
		Circle d =Circle.bigger(a, b);//Call the class method
		
	}
	
}
