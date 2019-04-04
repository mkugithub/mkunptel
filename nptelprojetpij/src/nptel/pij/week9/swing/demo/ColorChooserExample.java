package nptel.pij.week9.swing.demo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ColorChooserExample extends JFrame implements ActionListener  {

	JButton b;Container c;
	public ColorChooserExample() {
	    c=getContentPane();
	    c.setLayout(new FlowLayout());
	    b=new JButton("color");
	    b.addActionListener(this);
	    c.add(b);
		
	}
	
	
	
	
	public static void main(String[] args) {
		ColorChooserExample ch=new ColorChooserExample();
		ch.setSize(400, 400);
		ch.setVisible(true);
		ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Color initialColor=Color.red;
		Color color=JColorChooser.showDialog(this, "Select a color",initialColor);
		c.setBackground(color);
		
	}

}
