package beginnerJava;

public class Sting2 {

	public static void main(String[] args) {
		String f1= ("Shohanur rahman");
		String f2=(" ANd belive me i'm not robot");
		
		String s=f1.concat(f2);
		System.out.println(" "+s);
        f1.toUpperCase();
        System.out.println(""+f1);
         String f5=f2.toLowerCase();
        System.out.println(" "+f5);
        String f6=f2.toUpperCase();
        System.out.println(" "+f6);
        
        boolean n=f1.startsWith("s");
        		System.out.println(" "+n);
        		
        boolean last=f2.endsWith("t");
        System.out.println(" "+last);
       
        
        String name[]= {"ANis","fucking bitch","bitch"};
        for(int i=0;i<3;i++) {
        	System.out.println(name[i]);
        }
	}

}
