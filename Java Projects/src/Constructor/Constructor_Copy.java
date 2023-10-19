package Constructor;

class B{
	int id;
	String name;
	B(int i,String n ){
		id=i;
		name=n;
		
	}
	B(B a){
		id=a.id;
		name=a.name;
	}
	void display() {
		System.out.println("Id is "+id+"\n"+"The Name "+name);
	}
}

public class Constructor_Copy {

	public static void main(String[] args) {
		
		B a1=new B(10,"Rajesh");
		B a2=new B(a1);
		a1.display();
		a2.display();
		
	}

}
