package beginnerJava;
import java.util.Scanner;
public class SumOfDiagonal {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int a[][]=new int[3][3];
    int i,j,sum=0,sumup=0,sumdn=0;
    System.out.println("Enter the matrix :");
    for(i=0;i<a.length;i++) {
    	for(j=0;j<a.length;j++) {
    		a[i][j]=input.nextInt();
    	}
    }
    System.out.println();
    System.out.println("A matrix:");
    for(i=0;i<a.length;i++) {
    	for(j=0;j<a.length;j++) {
    		System.out.print(" "+a[i][j]);
    	}
    	System.out.println();
    }
    System.out.println();
    
    for(i=0;i<a.length;i++) {
    	for(j=0;j<a.length;j++) {
    		if(i==j) {
    		  sum=sum+a[i][j];
    		}
    		if(i<j) {
    			sumup=sumup+a[i][j];
    		}
             if(i>j) {
            	 sumdn=sumdn+a[i][j];
             }
    		
    	}
    }
    System.out.println("sum of dioagonal elements:"+sum);
    System.out.println("sum of upper diagonal elemensts:"+sumup);
    System.out.println("Sum of lower diagonal Elements: "+sumdn);
    
}
}