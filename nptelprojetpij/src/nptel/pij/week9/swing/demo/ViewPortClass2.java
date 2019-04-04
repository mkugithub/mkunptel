package nptel.pij.week9.swing.demo;

import javax.swing.*;
import java.awt.*;


public class ViewPortClass2 {

	public static void main(String[] args) {
         JFrame frame=new JFrame("Tabbed Pane Sample");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JLabel label=new JLabel("Label");
         frame.setPreferredSize(new Dimension(1000, 1000));
         
         JScrollPane pane=new JScrollPane(label);
         JButton button=new JButton();
         pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
         pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
         pane.getViewport().add(button,null);
         frame.add(pane,BorderLayout.CENTER);
         frame.setSize(400, 150);
         frame.setVisible(true);

	}

}
