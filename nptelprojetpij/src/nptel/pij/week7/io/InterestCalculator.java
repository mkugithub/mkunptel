package nptel.pij.week7.io;

import java.io.DataInputStream;
import java.io.IOException;

public class InterestCalculator {

	public static void main(String[] args) throws IOException {
		Float principalAmount=new Float(0);
		Float rateOfInterest=new Float(0);
		int numberOfYears=0;
		
		DataInputStream in =new DataInputStream(System.in);
		String tempString;
		System.out.print("Enter the principal amount: ");
		System.out.flush();
		tempString=in.readLine();
		principalAmount=Float.valueOf(tempString);
		System.out.print("Enter rate of interest : ");
		System.out.flush();
		tempString=in.readLine();
		principalAmount=Float.valueOf(tempString);
		
		System.out.print("Enter the number of Year : ");
		System.out.flush();
		tempString=in.readLine();
		numberOfYears=Integer.valueOf(tempString);
		
		//Input is over now calculate the intereset
		
		int totalInterest=(int) (principalAmount*rateOfInterest*numberOfYears);
		System.out.println("Total interest is :" +totalInterest);
		
	}

}
