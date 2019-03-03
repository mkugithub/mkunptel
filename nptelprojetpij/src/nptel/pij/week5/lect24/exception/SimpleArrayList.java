package nptel.pij.week5.lect24.exception;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleArrayList {

	public static void main(String[] args) {
		int sum=0;
		float avg=0;
		ArrayList<Integer> arr=new ArrayList<>();
		System.out.println("Enter the input ");
		Scanner input=new Scanner(System.in);

		while(input.hasNext()){
			arr.add(input.nextInt());
			
		}
		for(int i=0;i<arr.size();i++){
			sum=sum+arr.get(i);
		}
		
		avg=sum/arr.size();
		System.out.println("Average is:" +avg);
	}

}
