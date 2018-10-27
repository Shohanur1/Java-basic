package beginnerJava;

public class ArryOUtput {

	public static void main(String[] args) {
	  
	   int A[][]=new int[4][5];
	   int i,j,k=0;
	   
	   for(i=0;i<A.length;i++) {
		   for(j=0;j<A.length;j++) {
			 A[i][j]=k;
			 k++;
			   
		   }
	   }
	   
	   for(i=0;i<A.length;i++) {
		   for(j=0;j<A.length;j++) {
	           System.out.print("  "+A[i][j]);   

	}System.out.println();

}

	   
	}
	}