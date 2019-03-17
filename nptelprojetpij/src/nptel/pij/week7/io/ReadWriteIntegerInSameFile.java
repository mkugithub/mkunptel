package nptel.pij.week7.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteIntegerInSameFile {

	public static void main(String[] args) {

		DataInputStream dis = null;
		// Input Stream
		DataOutputStream dos = null;
		File intFile = new File("rand.dat");// Construct a file;

		// Writes integers to file
		try {

			dos = new DataOutputStream(new FileOutputStream(intFile));

			for (int i = 0; i < 20; i++) {
				dos.writeInt((int) (Math.random() * 100));
			}
		}

		catch (IOException e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				dos.close();
			} catch (IOException ioe) {
			}
		}

		// Reading integers from the file

		try {

			dis = new DataInputStream(new FileInputStream(intFile));// Create an
																	// input
																// stream
																	// for
																	// intFile
			for (int i = 0; i < 20; i++) {
				int n = dis.readInt();
				System.out.print(n + " ");
			}

		} catch (IOException ioe) {

			System.out.println(ioe.getMessage());
		} finally {
			try {
				dis.close();
			} catch (IOException ioe) {
			}

		}

	}

}
