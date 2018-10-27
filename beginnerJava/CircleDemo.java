package beginnerJava;

import java.util.Scanner;

public class CircleDemo {

	public static void main(String[] args) {
       Scanner lol= new Scanner(System.in);
       
       double r,area;
       System.out.print("Enter the radius:");
       
       r=lol.nextDouble();
       
       area=3.1415*r*r;
       
       System.out.println("So the answer is :"+area);
       

	}

}
