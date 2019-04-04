package nptel.pij.week9.swing.demo.xvi;
import java.applet.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Scribble1 extends Applet implements MouseListener,MouseMotionListener {
	
	private int last_x,last_y;
	public void init(){
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
	last_x=e.getX();
	last_y=e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent ed) {
		Graphics g=this.getGraphics();
	    int x=ed.getX(),y=ed.getY();
	    g.drawLine(last_x, last_y, x, y);
	    last_x=x;last_y=y;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		showStatus("Mouse clicked");
		
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
