package beginnerJava;
import java.util.Scanner;
public class MaximumANdMin {

	public static void main(String[] args) {
		double sum=0;
		Scanner input=new Scanner(System.in);
		double data[]=new double[5];
		for(int i=0;i<data.length;i++) {
			data[i]=input.nextDouble();
			
		}
		int i;
		for(i=0;i<data.length;i++) {
		 sum=sum+data[i];
		}
		System.out.println("The answer is : "+sum);
		double avg=sum/data.length;
		System.out.println("the avg is the number is :"+avg);
		
		double min=data[0];
		double max=data[0];
        for(i=1;i<data.length;i++) {
        	if(max<data[i])
        		max=data[i];
        	if(min>data[i]) {
        		min=data[i];
        	}
         }
        System.out.println("the maximum number is :"+max);
        System.out.println("The minimum number is :"+min);
	}

}
