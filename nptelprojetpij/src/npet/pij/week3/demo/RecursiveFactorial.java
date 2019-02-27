package npet.pij.week3.demo;

public class RecursiveFactorial {

	static int n;
	int factorial(int n){
		if(n==0)
			return 1;
		else
			return (n*factorial(n-1));
	}
	
	
	public static void main(String[] args) {
 RecursiveFactorial x=new RecursiveFactorial();
  x.n=Integer.parseInt(args[0]);
  System.out.println("Factorial of " +n+ ":" +x.factorial(x.n));

	}

}
