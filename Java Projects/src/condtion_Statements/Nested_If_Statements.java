package condtion_Statements;

public class Nested_If_Statements {

	public static void main(String[] args) {
		int a=20;
		if(a>0)
			if(a%2==0)
				System.out.println("The Given Number "+a+" is Even");
			else
				System.out.println("The Given Number "+a+" is Odd");
		else
			System.out.println("Enter the value greater than 0");

	}

}
