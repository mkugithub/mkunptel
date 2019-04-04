package nptel.pij.week9.swing.demo;
import javax.jws.soap.SOAPBinding.Style;
import javax.swing.*;
import javax.swing.tree.*;

public class JtreeExample {
	
	JFrame f;
	
	public JtreeExample() {
	
		f=new JFrame();
		DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");
		DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
		DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
		style.add(color);style.add(font);
		
		DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
		DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
		DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");
		DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");
		
		color.add(red);
		color.add(blue);
		color.add(black);
		color.add(green);
		JTree jt=new JTree(style);
		f.add(jt);
		f.setSize(400, 400);
		f.setVisible(true);
		
		
	}

	public static void main(String[] args) {
	    new JtreeExample();	
     
	}

}
