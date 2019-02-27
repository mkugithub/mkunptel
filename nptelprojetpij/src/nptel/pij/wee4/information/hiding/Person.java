package nptel.pij.wee4.information.hiding;

class Person {

}

class Student extends Person
{
	
}


class Undergraduate extends Student{
	public static void main(String [] args){
		
		Person p=new Person();
		Student s=new Student();
		Undergraduate ug =new Undergraduate();
		p=ug;//I correct
		p=new Undergraduate();//II -True;
		//ug=new Student();//III -Ilegal
		//ug=p;
		//s=new Person();// IV Ilegal
		
		
	}
	
}

