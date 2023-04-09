package java8.lambda.predicate;

import java.util.function.Predicate;

public class GreaterThanTwenty {

	public static void main(String[] args) {

		
		Predicate<Integer> p = i -> (i<20);  //implementaion
		
		System.out.println(p.test(20));
		System.out.println(p.test(15));
		System.out.println(p.test(21));

	}

}
