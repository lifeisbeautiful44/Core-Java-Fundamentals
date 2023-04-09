import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		Double d = 123456789.21312;

		NumberFormat nf = NumberFormat.getInstance();
		NumberFormat nf1 = NumberFormat.getInstance(Locale.GERMANY);
		
		nf.setMinimumFractionDigits(4);
		nf.setMaximumFractionDigits(3);

        
		System.out.println(nf.format(d));
		System.out.println(nf1.format(d));


	}

}
