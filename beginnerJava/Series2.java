package beginnerJava;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		int i,mul=1,n;
		
		Scanner input =new Scanner(System.in);
		n=input.nextInt();
		
		for(i=1;i<=n;i++) {
			mul=mul*i;
			System.out.println(i);
			
		}
		System.out.println("The answer is :"+mul);

	}

}
