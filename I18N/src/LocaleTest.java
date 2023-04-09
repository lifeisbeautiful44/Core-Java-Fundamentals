import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		
		Locale l = Locale.getDefault();
		System.out.println(l);
		
		System.out.println(l.getCountry()+ " "+ l.getLanguage());
		
//		Locale.setDefault(new Locale("ne_Ne"));
		Locale.setDefault(Locale.JAPANESE);
		System.out.println(Locale.getDefault().getDisplayCountry());
		
	
		String[] isoCountries = Locale.getISOCountries();
		for (String eachCountires : isoCountries) {
			System.out.println(eachCountires);
			
		}
		
		String[] languages = Locale.getISOLanguages();
		for (String eachLanguages : languages) {
			System.out.println(eachLanguages);
		}
		
		
		
	}

}
