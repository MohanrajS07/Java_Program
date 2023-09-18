package Star_Pattern;
import java.util.Scanner;

public class Star_Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=scan.nextInt();
		
		for(int i=0;i<=a;i++) {
			
			for(int j=0;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
