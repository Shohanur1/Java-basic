package beginnerJava;

import java.util.ArrayList;



public class ArrayList1 {

	public static void main(String[] args) {
	ArrayList<Double> n=new ArrayList<>();
	System.out.println("size= "+n.size());
	
	
	n.add(10.1);
	n.add(20.11);
	n.add(50.45);
	n.add(60.10);
	
	System.out.println("The list of array is : "+n);
	System.out.println("Size = "+n.size());
        
  
  
   System.out.println(" "+n);
   
  boolean c= n.isEmpty();
  System.out.println(" "+c);

  
  boolean d =n.contains(20.15);
  System.out.println(" "+d);
  
  int  p=n.indexOf(50.45);
  System.out.println(" "+p);
  
  n.set(2, 60.10);
  System.out.println(" "+n );
  
  double x=n.get(2);
  System.out.println(" "+x);

	} 

}
