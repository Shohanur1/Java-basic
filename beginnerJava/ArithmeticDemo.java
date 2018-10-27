package beginnerJava;

import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {
     Scanner lol=new Scanner(System.in);
		
		double n1,n2,result,result1;
		System.out.print("Enter the first number: ");
		n1=lol.nextDouble();
		System.out.print("Enter the second Number: ");
		
		n2=lol.nextDouble();
		
		
		result1=n1*n2;
     result=n1+n2;
     
     System.out.println("the answer is :"+result);
     System.out.println("the anser is :"+result1);    
	}

}
