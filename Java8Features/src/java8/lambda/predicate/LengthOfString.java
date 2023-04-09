package java8.lambda.predicate;

import java.util.function.Predicate;

public class LengthOfString {

	public static void main(String[] args) {

		
		Predicate<String> p = s -> (s.length()>6);
		System.out.println(p.test("Srijansil"));
		System.out.println(p.test("Aaru"));
	}

}
