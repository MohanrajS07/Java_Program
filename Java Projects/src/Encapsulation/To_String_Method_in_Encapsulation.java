package Encapsulation;

class Employee1{
	private int id;
	private String name;
	 void assign_data(int i,String n) {
		 id=i;
		 name=n;
		 
	 }
	
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}
	
}
public class To_String_Method_in_Encapsulation {

	public static void main(String[] args) {
		Employee1 e=new Employee1();
		e.assign_data(03,"Bharath");
		System.out.println(e.toString());
	

	}

}
