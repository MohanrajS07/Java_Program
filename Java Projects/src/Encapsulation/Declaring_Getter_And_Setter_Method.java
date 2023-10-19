package Encapsulation;

class Employee{
	private int id;
	private String name;
	private String job_desc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob_desc() {
		return job_desc;
	}
	public void setJob_desc(String job_desc) {
		this.job_desc = job_desc;
	}
//	void display() {
//		System.out.println("The Employee Id : "+id+"\n"+"The Employee Name : "+name+"\n"+"The Employee Job Description: "+job_desc);
//	}
}

public class Declaring_Getter_And_Setter_Method {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(02);
		e.setName("ArunKumar");
		e.setJob_desc("Engineer");
		System.out.println("The Employee Id : "+e.getId());
		System.out.println("The Employee Name : "+e.getName());
		System.out.println("The Employee Job Description: "+e.getJob_desc());
		//e.display();
		

	}

}
