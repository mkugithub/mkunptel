package nptel.pij.week7.io.demo;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.util.Scanner;

//Using class File to check the file status
public class Demostration_126 {
	public static void getPath(File file)throws IOException
	{
		System.out.println("Name :" +file.getName());
		System.out.println("Path :" +file.getPath());
		System.out.println("Parent :" +file.getParent());
	}
	
	public static void getInfo(File f) throws IOException{
		if(f.exists()){
		System.out.println("File exist!!");
		System.out.println(f.canRead()?"and is readable":"");
		System.out.println(f.canWrite()?"and is writable":"");
		System.out.println("File has last modified :" +f.lastModified());
		System.out.println("File is: "+f.length()+"bytes");
		}
		else{
			System.err.println("File does not exits");
		}
	}
	

	public static void main(String[] args) throws IOException {
		File fileToCheck;
		
		System.out.println("Enter the arguments");
		Scanner scanner=new Scanner(System.in);
	
		
		if(args.length>0){
			for(int i=0;i<args.length;i++){
				fileToCheck=new File(args[i]);
				getPath(fileToCheck);
				getInfo(fileToCheck);
				
			}
		}
		else{
			System.out.println("Usage: Java file object test< filename(s)>");
		}

	}

}
