package nptel.pij.week9.demo.lec41;

import java.awt.*;

public class ButtonExample  extends Component{

	public static void main(String[] args) {
		
		Frame f=new Frame("Button Example");
		Button b=new Button("Click Me");
		//b.setBounds(50, 100, 80, 30);
		b.setBounds(150, 50, 180, 130);
		f.add(b);
		//f.setSize(400, 400);
		f.setSize(600, 600);
		f.setLayout(null);
		f.setVisible(true);

	}

}
