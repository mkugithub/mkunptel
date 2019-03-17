package nptel.pij.week7.io;

import java.io.FileOutputStream;

public class WriteBytesToFile {

	public static void main(String[] args) {
		
		 byte [] cities={'D','E','L','H','I','\n', 'M','A','D','R','A','S','\n', 'L','O','N','D','O','N','\n'};
		
		 FileOutputStream fos=null;
		 try {
			fos=new FileOutputStream("cities.txt");
			//Connect output file to stream to cities.txt
			
			fos.write(cities);//Write a stream data to file
			fos.close();
			
		} catch (Exception e) {
			System.out.println(e);
			System.exit(-1);
			e.printStackTrace();
		}

	}

}
