package nptel.pij.week8.applet1;
import java.applet.*;
import java.awt.*;

public class HellowWorld extends Applet {
	
	//Use of init() method
	public void init(){
		resize(100, 100);
	}

	public void paint(Graphics g){
		g.drawString("Hellow Applet", 150, 150);
		setBackground(Color.white);;;
	}
	
}
