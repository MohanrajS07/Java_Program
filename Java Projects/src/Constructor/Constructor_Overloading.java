package Constructor;

class A{
	String a;
	A(){
		System.out.println("Default Constructor");
	}
	A(String a){
		System.out.println("Your Name Is "+a);
	}
}

public class Constructor_Overloading {

	public static void main(String[] args) {
		A a=new A();
		a=new A("Bharath");

	}

}
