package beginnerJava;

import java.util.Scanner;

public class findingSumAvg {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		double data[]=new double[5];
		double sum=0;
		System.out.println("please enter five numbers:");
		for (int i = 0; i < 5; i++) {
			data[i]=input.nextDouble();
		}
		
		for( int i=0 ;i<5;i++) {	
		sum=sum+data[i];
		}
		
		double avg=sum/data.length;
		System.out.println("The avg: "+avg);
		System.out.println("The sum:"+sum);

	}

}
