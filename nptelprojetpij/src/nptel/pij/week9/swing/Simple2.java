package nptel.pij.week9.swing;

import javax.swing.*;

//Creating a frame by extending JFrame
public class Simple2 extends JFrame{

	
	Simple2(){
	
	  JButton b=new JButton("Click");
	  b.setBounds(130,100,100,40);
	  add(b);
	  setSize(400, 500);
	  setLayout(null);
	  setVisible(true);
	  
	}
	
	
	public static void main(String[] args) {
		new Simple2();
	}

}
