package nptel.pij.week7.io.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demonstratioin_1210 {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("D:/output.dat");//If source file is from a network the we can give the network port
			BufferedInputStream bin = new BufferedInputStream(fin);
			// String s="Welcome to nptel";
			int i;
			while ((i = bin.read()) != -1) {
				System.out.println((char) i);

			}
			fin.close();
			bin.close();

		} catch (IOException e) {
          System.out.println(e);
		}

	}
}
