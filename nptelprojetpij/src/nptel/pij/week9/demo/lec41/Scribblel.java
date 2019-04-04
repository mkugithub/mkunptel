package nptel.pij.week9.demo.lec41;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Scribblel extends Applet implements MouseListener,MouseMotionListener {

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
	public void mouseDragged(MouseEvent me) {
		Graphics g=this.getGraphics();
		int x=me.getX(),y=me.getY();
		g.drawLine(last_x, last_y, x, y);
		last_x=x;
		last_y=y;
		
	}
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
