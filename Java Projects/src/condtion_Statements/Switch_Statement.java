package condtion_Statements;

public class Switch_Statement {

	public static void main(String[] args) {
		char Size='m';
		switch(Size) {
		case 'S':
		case 's':
			System.out.println("Smaller Size");
			break;
		case 'M':
		case 'm':
			System.out.println("Medium Size");
			break;
		case 'l':
		case 'L':
			System.out.println("Larger Size");
			break;
		default:
			System.out.println("Enter Valid Size");
		}

	}

}
