package nptel.pij.week7.io.demo;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demon_123 {

	public static void main(String[] args) {
			try{
		
				FileOutputStream fos=new FileOutputStream("E:/mjdocs/ImplementationTask/FreeShippingCR/test.txt");
				String s="Welcome to NPTEL Learning! Hope you enjoying java learingn";
				byte b[]=s.getBytes();//Converting string into byte array
				
				fos.write(65);
				fos.write(90);
				
				fos.write(b);
				fos.close();
				System.out.println("File writing is over !!");
			}
			catch(IOException e){
				System.out.println(e);
			}
		
	}

}
