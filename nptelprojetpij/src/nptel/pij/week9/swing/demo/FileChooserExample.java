package nptel.pij.week9.swing.demo;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class FileChooserExample extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu file;
    JMenuItem open;
    JTextArea ta;
    public FileChooserExample() {
		open=new JMenuItem("Open the file");
		open.addActionListener(this);
		file=new JMenu("File");
		file.add(open);
		mb=new JMenuBar();
		mb.setBounds(0, 0, 800, 20);
		mb.add(file);
		ta=new JTextArea(800,800);
		ta.setBounds(0, 20, 800, 800);
		add(mb);
		add(ta);
		
		
    	
	}
	
	
	
	public static void main(String[] args) {
		FileChooserExample fc=new FileChooserExample();
		fc.setSize(500, 500);
		fc.setLayout(null);
		fc.setVisible(true);
		fc.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==open){
			JFileChooser fc=new JFileChooser();
			int i=fc.showOpenDialog(this);
			if(i==JFileChooser.APPROVE_OPTION){
				File f=fc.getSelectedFile();
				String filePath=f.getPath();
				System.out.println(filePath);
				try{
					BufferedReader br=new BufferedReader(new FileReader(filePath));
					String s1="",s2="";
					while((s1=br.readLine())!=null){
						s2+=s1+"\n";
					}
				
					ta.setText(s2);
					br.close();
					
				}
				catch(Exception ex){}
				
			}
			
			
			
		}
		
	}

}
