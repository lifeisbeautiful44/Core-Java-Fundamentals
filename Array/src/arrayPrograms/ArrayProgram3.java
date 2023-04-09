package arrayPrograms;

public class ArrayProgram3 {
	public static void main(String[] args) {

		char c[] = { 'a', 'b', 'b', 'c', 'e', 'w', 'w', 'a' };
		
		if(c[0] == c[c.length -1])
		{
			System.out.println("First and last elements are same.");
		}
		else
		{
			System.out.println("First and last elements are not same. ");
		}
     
	}
}
