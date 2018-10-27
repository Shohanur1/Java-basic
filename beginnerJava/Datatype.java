package datatype;
import java.util.Scanner;
public class Datatype {

	public static void main(String[] args)
	{
	     Scanner input=new Scanner(System.in);
	     String name;
	     int id;
	     
	     System.out.println("Enter the name:");
	     name=input.nextLine();
	     System.out.println("Enter your id");
	     id=input.nextInt();
	     
	     System.out.println("Welcome to: "+name);
	     
	     System.out.println("your Id no id :"+id);
	   
	}
	
} 