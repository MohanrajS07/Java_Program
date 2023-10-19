package This_Keyword;
class D{
	void a(){
		System.out.println("a method");
	}
	void b() {
		System.out.println("b method");
		this.a();
	}
}
public class to_invoke_current_class_Method {

	public static void main(String[] args) {
		D d=new D();
		d.b();

	}

}
