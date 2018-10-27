package beginnerJava;

import java.util.Scanner;

public class Prime {



	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int n,count=0,i;
	System.out.println("Check the number:");
	n=input.nextInt();
	
	for(i=2;i<n;i++) {
		
		if(n%2==0) {
			count++;
			break;
		}
			
		
	}
	if(count==0)
		System.out.println("prime number");
	else
		System.out.println("not prime");
	
	
	}

}
