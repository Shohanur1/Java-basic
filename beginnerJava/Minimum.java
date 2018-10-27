package beginnerJava;

import java.util.Scanner;

public class Minimum {


	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		double data[] =new double[5];
		double sum=0;
		for(int  i=0;i<data.length;i++) {
			data[i]=input.nextDouble();
			
		}
		for(int i=0;i<data.length;i++) {
			sum=sum+data[i];
		}
		
		
		
		double avg=sum/data.length;
		System.out.println("The sum of the array is:"+sum);
	    System.out.println("The avg is : "+avg);
		
		double max=data[0];
		double min=data[0];
		for (int i = 1; i < data.length; i++) {
			if(max<data[i]) {
				max=data[i];
			}
			if(min>data[i]) {
				min=data[i];
			}
			
		}
		System.out.println(min);
		System.out.println(max);
	}

}