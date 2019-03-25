package nptel.pij.week8.applet1;
import java.applet.*;
import java.awt.*;

//Use of init to pass value through HTML to applet
public class RectangleTest extends Applet {

	int x,y,w,h;
	public void init()
	{
		x=Integer.parseInt(getParameter("xVaule"));
		y=Integer.parseInt(getParameter("yVaule"));
		w=Integer.parseInt(getParameter("wVaule"));
		h=Integer.parseInt(getParameter("hVaule"));
	}
	
	public void paint(Graphics g){
		g.drawRect(x, y, w, h);
	}
}
