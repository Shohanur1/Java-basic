package beginnerJava;

public class EachLoop {

	public static void main(String[] args) {
	int num[]= {10,20,30,40,50,60,70,80,90,100};
	
	int sum=0;
	
	for(int  x  : num) {
		
		sum=sum+x;
		
		System.out.println("The list of this String :"+x);
	}
	System.out.println("The answer is :"+sum);
 	}

}
