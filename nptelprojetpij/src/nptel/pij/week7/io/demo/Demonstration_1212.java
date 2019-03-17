package nptel.pij.week7.io.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Demonstration_1212 {

	public static void main(String[] args) {
		try {
			FileInputStream file1 = new FileInputStream("D:/input1.txt");//If source file is from a network the we can give the network port
			FileInputStream file2 = new FileInputStream("D:/input2.txt");
			
			SequenceInputStream file3 = new SequenceInputStream(file1,file1);//Concatenating file1 and file2 into file3
	        //Create buffered input and output streams
			BufferedInputStream inBuffer=new BufferedInputStream(file3);
			BufferedOutputStream outBuffer=new BufferedOutputStream(System.out);
			//Read and write till end of the file/buffers			
			int i;
			while ((i = inBuffer.read()) != -1) {
				outBuffer.write((char) i);

			}
			inBuffer.close();
			
			file1.close();
			file2.close();
			outBuffer.close();
		} catch (IOException e) {
          System.out.println(e);
		}



	}

}
