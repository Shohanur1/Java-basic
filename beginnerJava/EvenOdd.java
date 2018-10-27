package beginnerJava;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	   Scanner lol=new Scanner(System.in);
	   int n;
	   System.out.println("Enter any possitive number:");
	   
	   n=lol.nextInt();
	   if(n%2==0)
		   System.out.print("even number!");
	   else
		   System.out.print("ood number!");
	   

	}

}
