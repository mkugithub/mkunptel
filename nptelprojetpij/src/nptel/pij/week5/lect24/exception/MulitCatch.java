package nptel.pij.week5.lect24.exception;

public class MulitCatch {

	public static void main(String[] args) {
		int i =args.length;
		String[]  myString=new String[i];
		if(args[0].equals("JAVA")){
			System.out.println("Firs word is java: ");
			System.out.println("No of argument is " +i);
			int x=18/i;
			int y[]={555,999};
			y[i]=x;
			
		}
			

	}

}
