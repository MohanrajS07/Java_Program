package Class_Declaration_and_its_Examples;
class Employee//Employee is a Class Name
{
	int emp_id;
	String emp_name;
}

public class By_refernce_variable_assiging_Values_in_class {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.emp_id=10;
		e.emp_name="Raghu";
		System.out.println("Employee id: "+e.emp_id+" \n"+"Employee name: "+e.emp_name);
	}

}
