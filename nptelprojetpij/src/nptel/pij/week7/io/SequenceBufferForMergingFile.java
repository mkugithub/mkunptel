package nptel.pij.week7.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceBufferForMergingFile {

	public static void main(String[] args) throws IOException {
		//Declare files stream
		FileInputStream file1=null;
		FileInputStream file2=null;
		
		SequenceInputStream file3=null; //Declare file3 to store the combined file into it
		
		file1=new FileInputStream("text1.dat");//Open the files to be concatenated
		file2=new FileInputStream("text2.dat");//Open the files to be concatenated
		file3=new SequenceInputStream(file1, file2);
		
		//Concatenate the file1 and file2
		//Create buffered input and output stream
		
		BufferedInputStream inBuffer=new BufferedInputStream(file3);
		BufferedOutputStream outBuffer=new BufferedOutputStream(System.out);
		//Read and write till end of the buffer.
		int ch;
		while((ch=inBuffer.read())!=-1){
			outBuffer.write(ch);
			inBuffer.close();
			outBuffer.close();
			file1.close();
			file2.close();
		}
		
	}

}
