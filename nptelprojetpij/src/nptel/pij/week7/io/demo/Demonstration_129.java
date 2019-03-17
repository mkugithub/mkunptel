package nptel.pij.week7.io.demo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Example of BufferedOutputStream class for writing into a file
public class Demonstration_129 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("D:/testout1.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fout);
		String s="Welcome to nptel";
		
		byte b[]=s.getBytes();
		bos.write(b);	
		bos.flush();
		bos.close();
		fout.close();
		System.out.println("Successfully copyied");
		

	}

}
