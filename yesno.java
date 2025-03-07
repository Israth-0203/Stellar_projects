package israth;
import java.util.*;
public class yesno {
	public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	char x=str.charAt(0);
	char y=str.charAt(1);
	int flag=0;
	if(x==y) {
		flag=1;
	}
	else {
		for(int i=2;i<str.length();i++) {
			if(i%2==0)
				if(x!=str.charAt(i)) {
					flag=1;
					break;
				}
		}else if(y!=str.charAt(i)) {
			flag=1;
			break;
			
		}
	}
	if(flag==1) {
		
	}
	
	}

}
