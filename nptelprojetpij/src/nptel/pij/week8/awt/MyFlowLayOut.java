package nptel.pij.week8.awt;
import java.awt.*;

public class MyFlowLayOut {
	Frame f;
	
	public MyFlowLayOut() {
	 f=new Frame();
	
	 Button b1=new Button("1");
	 Button b2=new Button("2");
	 Button b3=new Button("3");
	 Button b4=new Button("4");
	 Button b5=new Button("5");
	 f.add(b1); 
	 f.add(b2);
	 f.add(b3);
	 f.add(b4);
	 f.add(b5);
	 
	 f.setLayout(new FlowLayout(FlowLayout.RIGHT));
	 //set the flow layout to right alignment
	 f.setSize(400,400);
	 f.setVisible(true);
	 
	}

	public static void main(String[] args) {
	
      new MyFlowLayOut();
		
	}

}
