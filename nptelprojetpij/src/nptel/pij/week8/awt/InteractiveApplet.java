package nptel.pij.week8.awt;
import java.awt.*;
import java.applet.*;

public class InteractiveApplet extends Applet {

	TextField inputA,inputB;
	public void init(){
		inputA=new TextField(8);
		inputB=new TextField(8);
		add(inputA);
		add(inputB);
		inputA.setText("0"); inputB.setText("1");
	}
	
	public void paint(Graphics g){
		int x=0;int y=0;int z=0;
		String s;
		g.drawString("Enter two values", 10, 50);
		try{
			s=inputA.getText(); x=Integer.parseInt(s);
			s=inputB.getText(); y=Integer.parseInt(s);
			z=x+y;s=String.valueOf(z);
			g.drawString("The sum is :", 10, 75);
			g.drawString(s, 100, 75);
		}
		catch(Exception e){}
	}
}
