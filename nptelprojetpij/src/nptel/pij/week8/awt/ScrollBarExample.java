package nptel.pij.week8.awt;

import java.awt.*;

public class ScrollBarExample {
	
	public ScrollBarExample() {
	    Frame f=new Frame();
	    Scrollbar s=new Scrollbar();
	    s.setBounds(100, 100, 50, 100);
	      f.add(s);
	    f.setSize(400,400);
	    f.setLayout(null);
	    f.setVisible(true);
	}

	public static void main(String[] args) {
	
		new ScrollBarExample();

	}

}
