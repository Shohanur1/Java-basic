package beginnerJava;

import java.util.Scanner;

public class loop1Demo {

	public static void main(String[] args) {
		int i,sum=0,n,m;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the initial value:");
	    n=input.nextInt();
	    System.out.println("Enter the range of this loop");
	    m=input.nextInt();
	    for(i=n;i<=m;i++) {
	    	
	      if(i%2==0) {
	    	  System.out.println(i);
	    	  sum+=i;
	      }
	      
	      
	    	
	    }
	    System.out.println();
	      System.out.println("The sum of the range is:"+sum);
	    	
		}

	

}
