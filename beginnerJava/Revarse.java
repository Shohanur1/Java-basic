package beginnerJava;

import java.util.Scanner;

public class Revarse {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=in.nextInt();
		int i,r,temp,sum=0;
		temp=n;
		while(temp!=0)
		{
			r=temp%10;
			sum=sum*10+r;
			temp=temp/10;
		}
		System.out.println(sum);
		if(n==sum) {
			System.out.println("Panlindrome\n");
		}else 
			System.out.println("not panlindrome");
	}

}
