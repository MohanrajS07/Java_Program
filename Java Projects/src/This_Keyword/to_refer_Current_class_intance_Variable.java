package This_Keyword;
class Student{
	String name;
	int rollno;
	Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	void display() {
		System.out.println(name+" "+"Roll no is "+rollno);
	}
}

public class to_refer_Current_class_intance_Variable {

	public static void main(String[] args) {
		Student s=new Student("Mohanraj",23);
		s.display();

	}

}
