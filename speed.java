package israth;
import java.util.*;

public class speed {
	public static void main (String[]args) {

	Scanner sc=new Scanner( System.in);
	float a=sc.nextFloat();
	float b=sc.nextFloat();
	float c=b-a;
	float d=c*25;
	


	System.out.printf("%.2f \n" ,c);
	System.out.println(Math.round(d));

	
	}
}
