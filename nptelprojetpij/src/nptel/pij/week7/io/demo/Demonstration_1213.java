package nptel.pij.week7.io.demo;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demonstration_1213 {

	public static void main(String[] args) {
	     RandomAccessFile file=null;
	     try{
	    	 file=new RandomAccessFile("rand.dat", "rw");
	    	 //writing to the file
	    	 file.writeChar('x');
	    	 file.writeInt(555);
	    	 file.writeDouble(3.14123);
	    	 file.seek(0);//Going to the begening
	    	 
	    	 //Read from the file
	    	 System.out.println(file.readChar());
	    	 System.out.println(file.readInt());
	    	 System.out.println(file.readDouble());
	    	 
	    	 file.seek(2);//Go to the second item
	    	 file.seek(file.length());
	    	 file.writeBoolean(false);
	    	 file.seek(4);
	    	 System.out.println(file.readBoolean());
	    	 file.close();
		    	 
	     }catch(IOException e){
	     System.out.println(e);
	     }
	}

}
