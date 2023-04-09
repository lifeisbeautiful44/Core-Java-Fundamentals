package mulitpilecatch;

public class MultipleCatch {
	
	public static void main(String[] args) {
		try {
		String input = args[0];
		System.out.println("Input :" + input);
		
		int i = Integer.parseInt(input);
		System.out.println("After parsing the string into integer: "+i);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You need to pass an argument ->> "+e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Make sure you pass an integer value --> " + e);
		}
		
		System.out.println("No termination of the program.");
	}

}
