package arrayPrograms;

public class ReverseStringArray {
	
	public static void main(String[] args) {
		String s1[] = {"String1" , "String2", "String3", "String4", "String5"};
		for(int i=( (s1.length) -1); i >= 0; i--  )
		{
			System.out.println(s1[i]);
		}
	}

}
