package beginnerJava;

import java.util.Scanner;

public class Checking {

	public static void main(String[] args) {
       		Scanner lol=new Scanner(System.in);
       		char ch;
       		
       		System.out.print("ENter any alfabet: ");
       		ch=lol.next().charAt(1);
       		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
       			System.out.print("vowel");
       		else
       			System.out.print("Consonant.");
       			
	}

}
