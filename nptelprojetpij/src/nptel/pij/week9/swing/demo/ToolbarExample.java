package nptel.pij.week9.swing.demo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import nptel.pij.week8.awt.MyFrame;



public class ToolbarExample {

	public static void main(String[] args) {
		JFrame f=new JFrame("JToolBar Example");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JToolBar toolbar=new JToolBar();
		toolbar.setRollover(true);
		
		JButton button=new JButton("File");
		   toolbar.add(button);
		   toolbar.addSeparator();
		   toolbar.add(new JButton("Exit"));
		   toolbar.add(new JComboBox<>(new String []{"Opt-1","Opt-2","Opt-3","Opt-4"}));
		
		Container contentPane=f.getContentPane();
		contentPane.add(toolbar,BorderLayout.NORTH);
		JTextArea textArea=new JTextArea();
		JScrollPane  mypane=new JScrollPane(textArea);
		contentPane.add(mypane, BorderLayout.EAST );
		f.setSize(450, 250);
		f.setVisible(true);
		
	}

}
