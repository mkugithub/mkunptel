package nptel.pij.week7.io;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingBytesFromFile {

	public static void main(String[] args) {
		FileInputStream fis=null;
		int b;
		try{
			fis=new FileInputStream(args[0]);
			//Connect fis stream to the required file
			while((b=fis.read())!=-1){
				System.out.print((char)b);//Read and display the data
			}
			fis.close();
		}
		catch(IOException e){
			System.out.println(e);
			
		}

	}

}
