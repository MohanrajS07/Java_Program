package Sum_of_Digits;

import java.util.Scanner;

public class Sum_of_Digits_Program {
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n,m,k;
		System.out.println("Enter the Starting Number");
		n=scan.nextInt();
		System.out.println("Enter the Ending Number");
		m=scan.nextInt();
		System.out.println("Enter the Finding Number");
		k=scan.nextInt();
		System.out.print("The results are ");
		int sum=0,t=0,l=0;
		for(int i=n;i<=m;i++) {
			t=i%10;
			l=i/10;
			sum=t+l;
			
			if(sum==k) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
