package immutable;


/*
   The == operator on the obecjt will check if the two object are pointing the same memory location.
   the equals(), method on string will check the content are same class
*/
public class Comparsion {
	
 public static void main(String[] args) {
	 String s1 = "something";
	 String s2 = "something";
	 
	 String s4 =   new String("something");
	 
	 System.out.println(s1==s2); //true
	 System.out.println(s1.equals(s4)); //true
	 System.out.println(s1==s4);  //false
	 
	
}

}
