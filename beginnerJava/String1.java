package beginnerJava;

public class String1 {

	public static void main(String[] args) {
		String s1="Shohanur Rahman";
		String s2= new String("Shohanur Rahman");
		
		char[] s3= {'S','h','o','h','a','n','u','r',' ','R','a','h','m','a','n'};
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		int i=s3.length;
		System.out.println("length of s3= "+ i);
		
		if(s1.equalsIgnoreCase("shohanur Rahman")) {
			System.out.println("Equal shit!");
		}
		else
			System.out.println(" not equal ");
    
	}

}
