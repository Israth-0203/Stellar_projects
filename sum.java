package israth;

import java.util.*;

public class sum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[][]=new int[n][n];
		
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]);
			}
 
             System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==j)||(i>j)) {
				   sum=sum+arr[i][j];
				
				}
		}
	}
	System.out.println("sum"+sum);
}
}

