package nptel.pij.week7.io.demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

///Copy the file from one to another file using the Character Stream Classes
public class Demonstration_127 {
	public static void main(String[] args) {
		
			//Declare and create a input and an output file
			File inFile=new File("D:/input.dat");
			File outFile=new File("D:/output.dat");
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


