package nptel.pij.week9.swing;

import javax.swing.*;

public class FirstSwingExample {

	public static void main(String args[]){
		//Create an instance of JFrame
		JFrame jf=new JFrame();
		//Create an instance of button
		JButton jb=new JButton();
		//X axis, Y axis, width,height
		jb.setBounds(130, 100,100, 40);
		jf.add(jb);
		jf.setSize(400, 500);
	    jf.setLayout(null);
	    jf.setVisible(true);
	}
	
}
