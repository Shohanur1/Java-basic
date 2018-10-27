package beginnerJava;

import java.util.Scanner;

public class BItwise {

	public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  int a,b;
	  a=input.nextInt();
	  b=input.nextInt();
	  int c;
	  c=a>>b;
	  System.out.println("a&b "+c);
	  c=a<<b;
	  System.out.println("a|b "+c);
	  c=a^b;
	  System.out.print("a^b "+c);
		  
		  
	  

	}

}
