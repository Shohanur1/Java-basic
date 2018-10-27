package beginnerJava;

import java.util.Scanner;

public class Seires1 {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner input=new Scanner(System.in);
		
		System.out.println("ENter the number:");
		n=input.nextInt();
		
		for(i=1;i<=n;i++) {
			System.out.printf("%dX%d\n",i,i);
			sum=sum+i*i;
			
			
			
		}
        System.out.println();
		System.out.println(sum);
	}

}
