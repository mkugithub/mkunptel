package nptel.pij.week5.lect23.execption;

public class CommandLineInputTest {

	public static void main(String[] args) {
		int number,invalidCount=0,validCount=0;
		for(int i=0;i<args.length;i++){
			try{
				number=Integer.parseInt(args[i]);
			}
			catch(NumberFormatException nfe){
				invalidCount++;
				System.out.println("Invalid number at i "+ args[i]);
			}
			validCount++;
			System.out.println("Valid number at i "+ args[i]);
			
		}
		System.out.println("Valid entries are: "+validCount);
		System.out.println("InValid entries are: "+ invalidCount);

	}

}
