package nptel.pij.week9.demo.lec41;

import java.awt.*;

public class ScrollBarExample {
	
	public ScrollBarExample() {
	    Frame f=new Frame();
	    Scrollbar h=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,100);
	    h.setBounds(100, 50, 300, 50);
	    
	    Scrollbar v=new Scrollbar(Scrollbar.VERTICAL,0,20,0,100);
	    v.setBounds(100, 200, 50, 300);
	      f.add(h);
	      f.add(v);
	    f.setSize(600,600);
	    f.setLayout(null);
	    f.setVisible(true);
	}

	public static void main(String[] args) {
		
     new ScrollBarExample();
		
	}

}
