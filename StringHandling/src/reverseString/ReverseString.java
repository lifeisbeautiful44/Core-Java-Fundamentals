package reverseString;

public class ReverseString {

	public String firstWay(String s) {
		String reverse = "";

		for (int i = s.length(); i > 0; i--) {
			reverse = reverse + s.charAt(i - 1);
		}

		return reverse;

	}
	


	public static void main(String[] args) {
		String s = "Srijansil";
		ReverseString rv = new ReverseString();
 
		System.out.println(rv.firstWay(s));

	}

}
