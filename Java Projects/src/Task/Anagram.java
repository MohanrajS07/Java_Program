package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String 1");
		String a=scan.nextLine();
		System.out.println("Enter the String 2");
		String b=scan.nextLine();
		
		char a1[]=a.toCharArray();
		char b1[]=b.toCharArray();
		if(a1.length!=b1.length) {
			System.out.println("Not Anagram");
			System.exit(0);
		}
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		for(int i=0;i<a1.length;i++) {
			if(a1[i]!=b1[i]) {
				System.out.println("Not Anagram");
				System.exit(0);
			}
		}
		System.out.println("Anagram");

	}

}
