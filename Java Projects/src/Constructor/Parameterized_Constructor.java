package Constructor;

class Student {
	private int id;
	private String name;
	private String degree;
	Student(int id,String name,String degree){
		System.out.println("This the Parameterized Constructor ,we can pass the Values");
		System.out.println("Student Id : "+id+" ,"+"Student Name: "+name+" ,"+"Degree: "+degree);
	}
}

public class Parameterized_Constructor {

	public static void main(String[] args) {
		Student s=new Student(1,"Akash","B.E");

	}

}
