package beginnerJava;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner lol=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter how many line you need:");
		n=lol.nextInt();
		
		for(i=n;i>=1;i++) {
			for(j=1;j<=i;j++) {
				
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		

	}

}
