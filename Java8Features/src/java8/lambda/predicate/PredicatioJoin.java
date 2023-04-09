package java8.lambda.predicate;

import java.util.function.Predicate;

public class PredicatioJoin {

	public static void main(String[] args) {

		int[] x = { 10, 20, 30, 40, 57, 3, 73, 70 };

		Predicate<Integer> p1 = i -> (i > 20);
		Predicate<Integer> p2 = i -> (i % 2 == 0);

		System.out.println("Greater than 10");
		method1(p1, x);

		System.out.println("Even Numbers");
		method1(p2, x);

		System.out.println("Not greater than 10"); // using negate
		method1(p1.negate(), x);

		System.out.println("Greater than 10 and Even numbers"); // using and
		method1(p1.and(p2), x);

		System.out.println("Greater than 10 or even numbers");  // using or
		method1(p2.or(p1), x);

	}

	static void method1(Predicate<Integer> p1, int[] x) {
		for (int eachValue : x) {

			if (p1.test(eachValue)) {
				System.out.println(eachValue);
			}

		}

	}

}
