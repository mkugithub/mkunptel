package nptel.pij.week7.io.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Copying a file to another file using the ByteStream classes 
public class Demonstration_128 {

	public static void main(String[] args) {
		//Declare and create a input and an output file stream
		FileInputStream inFile=null; //Input Stream class
		FileOutputStream outFile=null;//Output stream class
		
		byte byteRead;//Declare a variable to hold the byte
		
		
		try{
			//Connect inFile to input.dat
			inFile=new FileInputStream("D:/input.dat");
			//Connect outFile to output.dat
			outFile=new FileOutputStream("D:/output.dat");;
			//Open the outfile
			
			//Reading byte from in.dat and writing to out.dat 
			byteRead=(byte)inFile.read();
			while(byteRead!=-1){
				outFile.write(byteRead);
			}
			
		}
		catch(IOException e){
			System.out.println(e);
			System.exit(-1);
		}
		
		finally{
			try{
			inFile.close();//Close the file
				outFile.close();
			}
			catch(IOException e){
				
			}
		}
	}


	}


