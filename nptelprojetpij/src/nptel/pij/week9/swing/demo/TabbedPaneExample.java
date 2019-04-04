package nptel.pij.week9.swing.demo;

import javax.swing.*;

public class TabbedPaneExample {
	
	JFrame f;
	public TabbedPaneExample() {
	    f=new JFrame();
	    JTextArea ta=new JTextArea(200,200);
	    JPanel p1=new JPanel();
	    p1.add(ta);
	    JPanel p2=new JPanel();
	    JPanel p3=new JPanel();
	    JTabbedPane tp=new JTabbedPane();
	    tp.setBounds(50, 50, 200, 200);
	    tp.add("Main", p1);
	    tp.add("Visit", p2);
	    tp.add("Help", p3);
	    f.add(tp);
	    f.setSize(400, 400);
	    f.setVisible(true);
	    
		
	}
	

	public static void main(String[] args) {
       new TabbedPaneExample();		

	}

}
