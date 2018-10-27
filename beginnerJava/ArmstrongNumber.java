package beginnerJava;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,temp,sum=0;
		int r;
		System.out.println("Enter the number:");
		n=in.nextInt();
		
		temp=n;
		while(temp!=0) {
			r=temp%10;
			sum=(int) (sum+Math.pow(r,3));
			temp=temp/10;
		}
		
		System.out.println(sum);
		if(n==sum) {
			System.out.println("Armstrong");
		}
		else
			System.out.println("not Armstrong");

	}

}
