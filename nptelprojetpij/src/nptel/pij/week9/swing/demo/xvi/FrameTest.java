package nptel.pij.week9.swing.demo.xvi;

import java.awt.*;
import javax.swing.*;

public class FrameTest {

	public static void main(String[] args) {
		
		JFrame f1=new JFrame("My Frame1");
		
		/*//JFrame f2= new JFrame("My Frame2");
		//JFrame f3=new JFrame("My Frame3");
		JFrame f2=f1;
		JFrame f3=f2;
		f1.setVisible(true);
		f2.setVisible(true);
		f3.setVisible(true);*/
		f1.add(new Button("OK"));
		f1.add(new Button("CANCEL"));
		f1.add(new Button("SUBMIT"));
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(200, 200);
		f1.setVisible(true);
		
		
		
	}

}
