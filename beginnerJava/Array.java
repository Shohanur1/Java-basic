package beginnerJava;

public class Array {

	public static void main(String[] args) {
 	 
	int[] number=new int[5];
 	number[0]=102;
 	number[2]=1;
 	number[1]=100;
 	number[3]=15;
 	number[4]=12;
 	
 	int i;
 	int len=number.length;
 	System.out.println(len);
 	int sum=number[1]+number[3];
 	System.out.println("The anser is "+sum);
 	for(i=0;i<number[4];i++)
 	{
 		System.out.println(" "+number[i]);
 	}
 	
 	
 	
 	
 	
 	
	}

}
