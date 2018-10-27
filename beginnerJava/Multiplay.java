package beginnerJava;

import java.util.Scanner;

public class Multiplay {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int i,num;
		int j,n,m;
		System.out.println("Enter initial  :");
		n=input.nextInt();
		System.out.println("Enter range: ");
		m=input.nextInt();
		
		
		
		for(i=n;i<=m;i++) {
		
		
		for(j=1;j<=10;j++) {
			
			System.out.println(i+"X"+j+"="+i*j);
		}
		System.out.println();

	}
		}

}
