package nptel.pij.week8.awt;
import java.awt.*;

public class MyBorderLayoutManager {
	Frame f;
	
	public MyBorderLayoutManager() {
	   f=new Frame();
	   Button b1=new Button("NORTH");
		 Button b2=new Button("SOUTH");
		 Button b3=new Button("EAST");
		 Button b4=new Button("WEST");
		 Button b5=new Button("CENTER");
		 f.add(b1,BorderLayout.NORTH); 
		 f.add(b2,BorderLayout.SOUTH);
		 f.add(b3,BorderLayout.EAST);
		 f.add(b4,BorderLayout.WEST);
		 f.add(b5,BorderLayout.CENTER);
		 
		 //f.setLayout(new FlowLayout(FlowLayout.RIGHT));
		 //set the flow layout to right alignment
		 f.setSize(300,300);
		 f.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new MyBorderLayoutManager();

	}

}
