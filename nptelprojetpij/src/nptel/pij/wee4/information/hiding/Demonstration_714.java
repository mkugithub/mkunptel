package nptel.pij.wee4.information.hiding;

class A4{
	int i;//public by default
	protected int j;//priavte to A4
	
	private void setIJ(int x, int y){

		i=x;
		j=y;
	}
	
}

class B4 extends A4{
	int total;
	void sum(){
		total=i+j;//error j is not accessible here
	}
}

public class Demonstration_714 {

	public static void main(String[] args) {
		

	}

}
