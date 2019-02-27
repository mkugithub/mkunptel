package npet.pij.week3.demo;

import java.util.Scanner;

public class RecursiveExampleTest {
	
	static int count=0;
	static void p(){
		if(count<=5)
		{
			System.out.println("Hello " +count);
			p();
		}
		
	}

	public static void main(String[] args) {
		/*Scanner scan=new Scanner(System.in);
		scan.hasNextLine();
		System.out.println("Enter the number:" );*/
		
		p();

	}

}
