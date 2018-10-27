package beginnerJava;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,i,f,a=0,b=1,sum=0;
		System.out.println("Enter the number:");
		n=in.nextInt();
		
		
		System.out.print(a+" "+b);
		for(i=3;i<=n;i++) {
			f=a+b;
			a=b;
			b=f;
			sum+=f;
			
	   	 System.out.print(" "+f);
		     	
			
		}
		
		System.out.printf(" %d",sum+1);
		
		
		

	}

}
