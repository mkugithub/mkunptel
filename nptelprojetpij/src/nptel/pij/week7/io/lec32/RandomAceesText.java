package nptel.pij.week7.io.lec32;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAceesText {

	public static void main(String[] args) {
	     
		RandomAccessFile rFile=null;
		try{
			rFile=new RandomAccessFile("city.txt", "rw");
			rFile.seek(rFile.length()); //Go to the end
			rFile.writeBytes("Mumbai\n");
			System.out.println(rFile.readByte());
			rFile.close();
			
			
			
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		

	}

}
