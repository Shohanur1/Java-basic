package beginnerJava;
import java.util.ArrayList;
public class Arraylist2 {

	public static void main(String[] args) {
	ArrayList<Integer>n1=new ArrayList<>();
	ArrayList<Integer>n2=new ArrayList<>();
	ArrayList<Integer>n3=new ArrayList<>();
	ArrayList<Integer>n4=new ArrayList<>();
	
	
	n1.add(10);
	n1.add(30);
	n1.add(40);
	n1.add(50);
	System.out.println(" "+n1);
	
	
	n2.add(12);
	n2.add(13);
	n2.add(14);
	n2.add(15);
	System.out.println(" "+n2);
	


	n3.addAll(n1);
	System.out.println(" "+n3);
	
	boolean r= n3.equals(n1);
	System.out.println("Number1==Number3 = "+r);
	
	
	
	
	
	
	
	}
	
}
