
public class StringMethods {
	public static void main(String[] args) {
		String s = "Srijansil Bohara";
		
		System.out.println("Length of the string " + s.length());
		System.out.println("Index of " + s.indexOf('a'));  //index of the particular char.
		System.out.println("char At " + s.charAt(3));    // value at the particular index.
		
		System.out.println("Begining at " + s.substring(2)); // prints from the index 2 of the string
		System.out.println("Begining at to ending at "+ s.substring(0,2 )); // prints from the index 0 to index 2-1. 
		
		String [] afterSplit = s.split(" ");
		
		for (int i = 0; i < afterSplit.length; i++) {
			System.out.println(afterSplit[i]);
			
		}
		
		System.out.println("Replace: "+ s.replace("s", "l"));
		System.out.println("Uppercase " + s.toUpperCase());
		System.out.println("Lowercase " + s.toLowerCase());

		
	}

}
