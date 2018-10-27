package beginnerJava;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
	  Scanner input= new Scanner(System.in);
	  int a[][]=new int[2][3];
	  int b[][]=new int[2][3];
	  int sum[][]=new int[2][3];
	  int i,j;
	  
	  
	  System.out.println("Enter the 1st  array:");
	  for( i=0;i<2;i++) {
		  for( j=0;j<3;j++) {
			  a[i][j]=input.nextInt();
		  }
	  }
	  System.out.println("Enter the 2nd array:");
	  for( i=0;i<2;i++) {
		  for( j=0;j<3;j++) {
			  b[i][j]=input.nextInt();
		  }
	  }
	  System.out.print("A= ");
	  for(i=0;i<2;i++) {
		  for(j=0;j<3;j++) {
			  System.out.print("\t "+a[i][j]);
		  }
		  System.out.println();
	  }
	  System.out.println();
	  
	  System.out.print("B= ");
	  for(i=0;i<2;i++) {
		  for(j=0;j<3;j++) {
			  System.out.print("\t "+b[i][j]);
			  
		  }
		  System.out.println();
	  }
	  System.out.println("Sum of those tow matix: ");
	  
	  for(i=0;i<2;i++) {
		  for(j=0;j<3;j++) {
			  sum[i][j]=a[i][j]+b[i][j];
			System.out.print("\t "+sum[i][j]);
			  
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	}

}
