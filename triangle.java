package israth;
import java.util.Scanner;


public class triangle {

	public class zodiac {
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(a+b+c==180) {
				
				if(a==90||b==90||c==90) {
					System.out.println("prize 2,right angle triangle");
				}
				else if(a==b&&b==c) {
					System.out.println("prize 3,equilateral triangle");
				}
				else {
					System.out.println("prize 1,any triangle");
					
					}
			
		}
	        else {
	        	System.out.println("no prize");
	        }
		}
		

	}
		


}
