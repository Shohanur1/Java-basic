package beginnerJava;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayLIst {

	public static void main(String[] args) {
		ArrayList<Integer>n1= new ArrayList<>();
		
		n1.add(10);
		n1.add(200);
		n1.add(30);
		n1.add(-400);
		n1.add(50);
		
        System.out.println("Before sorting = "+n1);
        
        Collections.sort(n1);	
        System.out.println("After sorting = "+n1);
        
        
        Collections.sort(n1,Collections.reverseOrder());
        
        System.out.println("After sorting in desending: "+n1);
	}

}
