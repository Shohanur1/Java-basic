package beginnerJava;

public class String4 {

	public static void main(String[] args) {
		String s1= "Shohanur Rahamaj";
		System.out.println("Original String: "+s1);;
		String s2=s1.replace('j','n');
		System.out.println("After Changing "+s2);;
		String[] s3=s2.split(" ");
		for(String x : s3) {
			System.out.println(x);
		}
		
        }
	}


