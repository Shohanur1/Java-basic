package beginnerJava;

import java.util.Scanner;

public class Tempearature {

	public static void main(String[] args) {
		Scanner t =new Scanner(System.in);
		
		double f,c;
		System.out.print("Enter the celcius: ");
		c=t.nextDouble();
		f=(1.8)*c+32;
		
		System.out.println("The answer is :"+f);
		
		

	}

}
