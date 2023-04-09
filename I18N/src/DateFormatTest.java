import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
	
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		DateFormat usDF = DateFormat.getDateInstance(3,Locale.US);  // for the date.
		DateFormat ukDF = DateFormat.getDateInstance(3, Locale.UK);
		
//		System.out.println(usDF);
//		System.out.println(ukDF);

		
		System.out.println("Date in US format: "+ usDF.format(d));
		System.out.println("Date in Uk Format: " + ukDF.format(d));
		
		
		DateFormat timeInstance = DateFormat.getTimeInstance();   // for the time.
		System.out.println(timeInstance.format(d));
		
		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(2, 2);  // for the date & time.
		System.out.println(dateTimeInstance.format(d));
		
		
	}

}
