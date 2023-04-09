import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) throws ParseException {
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/dd hh:mm:ss");
         String date = sdf.format(new Date());
         System.out.println(date);
         
         
         String dateAsString = "12-8-2022";
         SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy");
         Date date1 = sdf1.parse(dateAsString);
         System.out.println(date1);
         
//         SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/M/dd");
//         String dtae = sdf3.format(date1);
//         System.out.println(dtae);
//
//         
//         
         
	}
}
