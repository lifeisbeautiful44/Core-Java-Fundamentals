
public class StringDemo  {

	public static void main(String[] args) {
		// different ways to create string

		String s1 = "Hello";
//		System.out.println(s1.hashCode());
//		String s4 = "Hello";
//		System.out.println(s4.hashCode());

		String s2 = new String("Stijansil");

		char[] c = { 'a', 'e', 'i', 'o', 'u' };

		String s3 = new String(c);

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s3);

	}

}
