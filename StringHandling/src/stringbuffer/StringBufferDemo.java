package stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("Inital capicity "+ sb.capacity());
		
		sb.append("Srijansil");
		sb.append(" is a java developer..");
		
		System.out.println(sb);
		System.out.println("Current Capacity " +sb.capacity());
		
		System.out.println(sb.insert(3, 'z'));
		System.out.println(sb.delete(2, 5));
		
		StringBuffer sb1 = new StringBuffer("All the power is within you..");
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		
		

	}

}
