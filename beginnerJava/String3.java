package beginnerJava;

public class String3 {

	public static void main(String[] args) {
		String c="Bangladesh is my country!";
		System.out.println(c);
		
		String r=c.trim();
		System.out.println(r);
		
		char ch=c.charAt(2);
		System.out.println(ch);
		
		
		int v=c.codePointAt(3);
		System.out.println(" value = "+v);
		
		
		int p=c.indexOf('c');
		System.out.println(p);

		
		
		int l=c.lastIndexOf('y');
		System.out.println(l);
	}

}
