package nptel.pij.week7.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Copy character from one file to another file

public class CopyCharacterFromToFile {

	public static void main(String[] args) {

		//Declare and create a input and an output file
		File inFile=new File("input.dat");
		File outFile=new File("output.dat");
		FileReader ins=null;
		FileWriter outs=null;
		
		//Create file stream out
		try{
			ins=new FileReader(inFile);
			//Open the infile
			outs=new FileWriter(outFile);
			//Open the outfile
			int ch;//Read and write till end of the files
			while((ch=ins.read())!=-1){
				outs.write(ch);
			}
			
		}
		catch(IOException e){
			System.out.println(e);
			System.exit(-1);
		}
		
		finally{
			try{
				ins.close();//Close the file
				outs.close();
			}
			catch(IOException e){
				
			}
		}
	}

}
