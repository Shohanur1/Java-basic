package beginnerJava;

import java.util.Scanner;

public class ConditionalDemo {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n1,n2;
		System.out.print("Enter two number :");
		 n1=input.nextInt();
		 n2=input.nextInt();
		
		int  large;
		large=(n1>n2)?n1:n2;
		
		
		System.out.print("large numbr is "+large);
		
		

	}

}
