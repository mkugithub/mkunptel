package nptel.pij.week9.swing;

import javax.swing.*;

public class JSeparaterExample {
	JMenu menu,submenu;
	JMenuItem i1,i2,i3,i4,i5;
	
	public JSeparaterExample() {
		JFrame f=new JFrame("Separater Example");
		JMenuBar mb=new JMenuBar();
		menu=new JMenu("Menu");
		i1=new JMenuItem("Item1");
		i2=new JMenuItem("Item2");
		menu.add(i1);
		menu.addSeparator();
		menu.add(i2);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		new JSeparaterExample();

	}

}
