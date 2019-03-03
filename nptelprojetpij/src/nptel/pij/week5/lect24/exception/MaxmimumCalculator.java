package nptel.pij.week5.lect24.exception;

import java.util.Scanner;

public class MaxmimumCalculator {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		//Calculate of maximum of two number in java
		System.out.println("Enter value of a:");
		int a =scnr.nextInt();
		System.out.println("Enter value of b:");
		int b =scnr.nextInt();
       if(a>b){
    	   System.out.printf("Between %d and %d, maximum is %d \n", a ,b,a );
       }
       else{
    	   System.out.printf("Between %d and %d, maximum is %d \n", a ,b,a );
       }
		
	}

}
