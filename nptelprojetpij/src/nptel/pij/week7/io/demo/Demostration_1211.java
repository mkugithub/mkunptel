package nptel.pij.week7.io.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

//Java SequenceInputStream Example: Reading sequence of files/
public class Demostration_1211 {

	public static void main(String[] args) {
		try {
			FileInputStream input1 = new FileInputStream("D:/input1.txt");//If source file is from a network the we can give the network port
			FileInputStream input2 = new FileInputStream("D:/input2.txt");
			SequenceInputStream sin = new SequenceInputStream(input1,input2);
			int i;
			while ((i = sin.read()) != -1) {
				System.out.print((char) i);

			}
			sin.close();
			input1.close();
			input2.close();

		} catch (IOException e) {
          System.out.println(e);
		}

		

	}

}
