package beginnerJava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int i,n,f=1;
		n=input.nextInt();
		
		for(i=n;i>=1;i--) {
			f=f*i;
			
			
			
		}
		System.out.println(f);

	}

}
