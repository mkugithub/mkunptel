package nptel.pij.week7.io.demo;

import java.io.FileInputStream;
import java.io.IOException;

public class Demonstration_124 {

	public static void main(String[] args) {
		try{
			FileInputStream fis=new FileInputStream("E:/mjdocs/ImplementationTask/FreeShippingCR/test.txt");
			int i=fis.read();
			System.out.print((char)i);//Will return in value in ASCI format/ char
			
			System.out.print(i);//Will return value in byte
			
			fis.close();
			System.out.println("\nFile reading is over !!");
		}
		catch(IOException e){
			System.out.println(e);
		}		

	}

}
