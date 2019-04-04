package nptel.pij.week9.demo.lec41;
import java.io.*;
import java.awt.*;


	public class StudentFile extends Frame {
		//Define window components
		
		TextField number,name,mark;
		Button enter ,done;
		Label numLable,markLabel,nameLable;
		DataOutputStream dos;
		
		//Initialize the frame
		public StudentFile(){
			super("Create Student File");
		}
		
		//Setup the window
		public void setup(){
			resize(400, 200);
			setLayout(new GridLayout(4, 2));
			
			//Create the component of Frame
			number=new TextField(25);
			numLable=new Label("Roll Number");
			name=new TextField(25);
			nameLable=new Label("Student name");;
			mark=new TextField(25);
			markLabel=new Label("Marks");
			enter=new Button("ENTER");
			done=new Button("Done");
			//Add component to the frame:
			add(numLable);
			add(number);
			add(nameLable);
			add(name);
			add(markLabel);
			add(enter);
			add(done);
			//show the frame
			show();
		
			//Open the file
			try{
				dos=new DataOutputStream(new FileOutputStream("student.dat"));
			}
			catch(IOException ioe){
				System.out.println(ioe.toString());
				System.exit(1);
			}
			
			
		}

		//Write to the files
		public void addRecord(){
			int num;
			Double d;
			num=(new Integer(number.getText()).intValue());
			try{
				dos.writeInt(num);
				dos.writeUTF(name.getText());
				d=new Double(mark.getText());
				dos.writeDouble(d.doubleValue());
			}
			catch(IOException e){}
				//Clear the text field
				number.setText("");
				name.setText(" ");
				mark.setText(" ");
			
		}
		
		//Adding the record and clearig the text field
		public void cleanup(){
			if(!number.getText().equals(" ")){
				addRecord();
			}
			try{
				dos.flush();
				dos.close();
			}catch(IOException e){}
			
		}
		
		
		//Processing the event 
		public boolean action(Event event, Object object){
			if(event.target instanceof Button)
				if(event.arg.equals("ENTER")){
					addRecord();
					return true;
				}
				return super.action(event, object);
		}
		
		public boolean handleEvent(Event event){
			if(event.target instanceof Button)
				if(event.arg.equals("DONE")){
					cleanup();
					System.exit(0);
					return true;
				}
				return super.handleEvent(event);
		}
		
		
		public static void main(String[] args) {
		
			StudentFile student=new StudentFile();
			student.setup();
		}

	
	
}
