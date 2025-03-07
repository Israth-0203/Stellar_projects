package israth;
import java.util.*;

public class january_1 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y=sc.nextInt();
		int given_year=2000;
		int ry=0;
		int ly=0;
		y=(y-1)-given_year;
		ly=y/4;
		ry=y-1;
		int totaldays=(ry*365)+(ly*366)+1;
		int day=totaldays%7;
		if(day==0)
		{
			System.out.println("monday");
			}
		else if(day==1)
		{
			System.out.println("tuesday");
		}
		else if(day==2)
		{
			System.out.println("wednesday");
		}
		else if(day==3)
		{
			System.out.println("thrusday");
		}
		
		
	}
}