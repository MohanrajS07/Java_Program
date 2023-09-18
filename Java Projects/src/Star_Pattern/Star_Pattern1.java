package Star_Pattern;
import java.util.Scanner;

public class Star_Pattern1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		int a=scan.nextInt();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || j==1|| j== 5 || i==5) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
