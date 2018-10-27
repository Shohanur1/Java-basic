package beginnerJava;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
	   Scanner in=new Scanner(System.in);
	   int n,i,r,sum=0;
	   System.out.println("Enter any number:");
	   
	   n=in.nextInt();
	   while(n!=0)
	   {
		   r=n%10;
		   sum=sum+r;
		   n=n/10;
	   }
	   System.out.println("The answer is : "+sum);
	   

	}

}
