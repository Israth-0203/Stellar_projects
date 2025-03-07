
 package israth;

import java.util.*;

public class lexico {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1=s.nextLine();
		String str2=str.toLowerCase();
		String str3=str1.toLowerCase();
	char ch[]=str2.toCharArray();
	char ch1[]=str3.toCharArray();
	int result=0;
	for(int i=0;i<ch.length;i++) {
		if(ch[i]!=ch1[i]) {
			result=(int)ch[i]-(int)ch1[i];
			break;
		}
	}
	
	System.out.println(result);
	}
}
