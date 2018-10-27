package beginnerJava;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter any number :");
		int num=input.nextInt();
		switch(num) {
		   
		case 1:
		  System.out.print("One");
		  break;
		case 2:
			System.out.print("two");
			break;
		case 3:
			System.out.printf("three");
			break;
		default:
			System.out.print("number is not mathcing ");
	      	
		
		
		
		}

	}

}
