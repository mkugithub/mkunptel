package nptel.pij.week8.applet1;
import java.applet.*;
import java.awt.*;


public class StatusWindow extends Applet {
   
	public void inti(){
		setBackground(Color.cyan);
	}
	
	
	public void paint(Graphics g){
	   g.drawString("This is applet window", 10, 20);
	   showStatus("This is shown in status window");
   }
	
	/*<html>
	<body>
	<applet code="StatusWindow.class" width=200 height=50>
	</applet>
	</body>
	
	</html>*/
	
}

