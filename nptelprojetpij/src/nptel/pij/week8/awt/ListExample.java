package nptel.pij.week8.awt;
import java.awt.*;

public class ListExample {
   public ListExample() {
    Frame f=new Frame();
    List l=new List(5);
    l.setBounds(100, 100, 75, 75);
    l.add("Item1");
    l.add("Item2");
    l.add("Item3");
    l.add("Item4");
    
    f.add(l);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    
    
  }

	public static void main(String[] args) {
        new ListExample();		

	}

}
