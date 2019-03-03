package nptel.pij.week5.lect23.execption;

public class CommandLineInput {

	public static void main(String[] args) {
		int number,count;
		for(int i=0;i<args.length;i++){
			number=Integer.parseInt(args[i]);
			System.out.println("Number at i "+ args[i]);
		}

	}

}
