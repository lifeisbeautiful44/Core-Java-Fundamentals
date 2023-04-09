package immutable;

public class ImmutableDemo {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "world";
		
		System.out.println("Before concat "+ "\n s1: "+s1+"\n s2: "+s2);
		System.out.println(s1.hashCode());
		
		s1 = s1.concat(s2);
		
		System.out.println("After concat "+ "\n s1: "+s1+ "\n s2: "+s2);
		System.out.println(s1.hashCode());
		
		

			
		
	}

}
