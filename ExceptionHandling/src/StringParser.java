
/*
 Integer.parseInt(s), it does not parse if the string s = abc,
    But if the string is 123 , than it will parse it 
  */
public class StringParser {
	public static void main(String[] args) {
		try {
			String s = "abcd";  
//			String a = "123"; //it will be parse 
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}

		System.out.println("Program is still running");
	}
}
