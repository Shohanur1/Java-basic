package beginnerJava;
import java.util.Arrays;
import java.util.Scanner;
public class SortinArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i;
		int a[]=new int[5];
		
		System.out.println("Enter those number :");
		for(i=0;i<a.length;i++) {
			a[i]=input.nextInt();
		}
		
		
		
		System.out.println("Acending :");
		Arrays.sort(a);
		for( i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		
		System.out.println();
		System.out.println("Desending :");
		for( i=a.length-1;i>=0;i--) {
			
			System.out.print(" "+a[i]);
		}
		
		System.out.println();
		
		
		String name[]= {"shohan","abir","Tushar","neloy"};
		Arrays.sort(name);
		for(i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
