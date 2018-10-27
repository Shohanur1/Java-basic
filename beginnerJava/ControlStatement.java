package beginnerJava;
import java.util.Scanner;
public class ControlStatement {

	public static void main(String[] args) {
		Scanner lol=new Scanner(System.in);
		
		int num=lol.nextInt();
		
		if(num>0) {
			System.out.print("possitve.");
		}
		
		else if(num==0){
			System.out.print("ZEro");
			
		}
		else
			System.out.print("Negative.");

	}

}
