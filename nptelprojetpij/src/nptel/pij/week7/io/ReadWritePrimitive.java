package nptel.pij.week7.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadWritePrimitive {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File primitive=new File("prim.dat");
		
		FileOutputStream fos=new FileOutputStream(primitive);
		DataOutputStream dos=new DataOutputStream(fos);
		//Write primitive data to the prim.dat
		
		dos.writeInt(1999);
		dos.writeDouble(4.567);
		dos.writeBoolean(true);
		dos.writeChar('V');
		
		dos.close();
		fos.close();
		//Read data from prim.dat
		
		FileInputStream fis=new FileInputStream(primitive);
		DataInputStream dis=new DataInputStream(fis);
		System.out.println(dis.readDouble());
		System.out.println(dis.readInt());
		//System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		
		dis.close();
		fis.close();
        
	}

}
