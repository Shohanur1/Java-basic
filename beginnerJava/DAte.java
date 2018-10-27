package beginnerJava;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DAte {

	public static void main(String[] args) {
		Date date=new Date();
		
		DateFormat dateformate= new SimpleDateFormat("dd/MM/yy");
		String current=dateformate.format(date);
		System.out.println(current);

	}

}
