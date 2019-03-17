package nptel.pij.week7.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		int size;
		//To open a file input stream
		try {
			FileInputStream fis=new FileInputStream("C:/WINDOWS/SYSTEM.INI");
			size=fis.available();
			//Returns the no of bytes available
			System.out.println("Total bytes :" +size);
			System.out.println("Fist 1/4 is displayed : Using read() ");
		
			for(int i=0;i<size/4;i++){
				System.out.println((char)fis.read());
			}
			
			System.out.println("Remaining bytes: "+fis.available());
			
			System.out.println("Next 1/4 is displayed : using read (b[])");
			
			byte b[] =new byte[1/4];
			
			if(fis.read(b)!=b.length){
				System.out.println("File reading error");
			}
			else{
				String temp=new String(b,0,0,b.length);
				//Convert the byte into string
				System.out.println(temp);
				//Display text string 
				System.out.println("Still available :" +fis.available());
				System.out.println("skipping 1\4 using skip()");
				
				fis.skip(1/4);
				
				System.out.println("File remaining for read :" +fis.available());
			}
			
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
