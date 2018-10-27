package beginnerJava;

import java.util.Scanner;

public class PrimeCount {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,m,i,count=0,j, totalprime=0;
	    System.out.println("Enter initial value:");
		n=in.nextInt();
		System.out.println("ENter ending number:");
		m=in.nextInt();
		for(i=n;i<=m;i++) {
			for(j=2;j<i-1;j++) {
				if(i%j==0) {
					count++;
					break;
				}
					
			}if(count==0) {
				System.out.println(i);
				totalprime++;
			}
			count=0;
				
			    
		}
		System.out.println("total prime number :"+totalprime);
				
	}

}
