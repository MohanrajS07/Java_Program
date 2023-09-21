package Class_Declaration_and_its_Examples;
class Student1{
	int id;
	String name;
	void add_data(int i,String n) {
		id=i;
		name=n;
	}
	void display_data() {
		System.out.println("Student id: "+id+" \n"+"Student Name: "+name);
	}
}

public class Initialization_Through_Method_in_Class {

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.add_data(13, "Akash");
		s.display_data();

	}

}
