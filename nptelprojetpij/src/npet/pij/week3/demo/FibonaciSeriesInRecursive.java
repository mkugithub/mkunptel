package npet.pij.week3.demo;

import java.io.IOException;

public class FibonaciSeriesInRecursive {
	
	int n;
	int fibonacci(int n){
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else 
			return (fibonacci(n-1)+fibonacci(n-2));
	}

	public static void main(String [] args) throws IOException
	{
		FibonaciSeriesInRecursive x=new FibonaciSeriesInRecursive();
		//x.n=Integer.parseInt(args[0]);
		x.n=System.in.read();
		for(int i=0; i<=x.n;i++){
			System.out.println(x.fibonacci(i));
		}
		
	}
}


//Recursive algorithm to calculate the fibonacci sequence in java
//Fn=F(n-1)+F(n-2);

