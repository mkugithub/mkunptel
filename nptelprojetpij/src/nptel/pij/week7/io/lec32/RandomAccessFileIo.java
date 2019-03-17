package nptel.pij.week7.io.lec32;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileIo {

	public static void main(String[] args) {
		
		RandomAccessFile file=null;
		try{
			
			file=new RandomAccessFile("rand.dat", "rw");
			//Writing to the files
			file.writeChar('X');
			file.writeInt(555);
			file.writeDouble(3.14);
			file.seek(0);
			//Go to the begining and and read from the file
			System.out.println(file.readChar());
			System.out.println(file.readInt());
			System.out.println(file.readDouble());
			file.seek(2);
			//Go to the second item
			System.out.println(file.readInt());
			//Go to end and append false to the file
			file.seek(file.length());
			file.writeBoolean(false);
			file.seek(4);
			System.out.println(file.readBoolean());
			
			file.close();
			
			
		}
		catch(Exception ioe){
			System.out.println(ioe.getMessage());
		}

	}

}
