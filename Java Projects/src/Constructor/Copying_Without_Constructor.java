package Constructor;

class C{
	int id;
	String name;
	C(int i,String n){
		id=i;
		name=n;
	}
	C(){}
	void display() {
		System.out.println("Name: "+name+" "+" Id: "+id);
	}
}
public class Copying_Without_Constructor {

	public static void main(String[] args) {
		C c1=new C(20,"Mohan");
		C c2=new C();
		c2.id=c1.id;
		c2.name=c1.name;
		c1.display();
		c2.display();
		

	}

}
