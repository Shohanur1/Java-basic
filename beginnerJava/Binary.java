package beginnerJava;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		
		
		System.out.println("Enter the number:");
		int d=i.nextInt();
		
		String bin=Integer.toBinaryString(d);
		System.out.println("Decimal to bin: "+bin);
		String oc=Integer.toOctalString(d);
		System.out.println("Decimal to Octal: "+oc);
		String hex=Integer.toHexString(d);
		System.out.println("Decimal to Hexadecimal: "+hex);
	    

	}

}
