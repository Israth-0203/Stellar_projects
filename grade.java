package israth;

import java.util.Scanner;

public class grade {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		if(mark>=85) {
			System.out.println("A");
		}
		else if(mark>=75) {
			System.out.println("B");
		}
		else if(mark>=65) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}

}
