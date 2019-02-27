package npet.pij.week3.demo;

public class Demonstration_511 {
	public static void main(String [] args){
		
		int x;
		x=10;
		if(x==10)
		{
			int y=20;
			System.out.println("X and Y :" +x+ " " +y);
			x=y*2;
		}
		
		//y=100;//Out of scope variable
		
		System.out.println("X is :" +x);
	}
	

}
