package beginnerJava;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		char ch;
		ch=input.next().charAt(0);
		
		if(ch>='a' && ch<='z')
			System.out.print("The alfabet is lower ");
		else if(ch>='A'&& ch<='Z')
			System.out.print("The alfabet is upper!");
		else
			System.out.print("This is not a letter!");

	}

}
