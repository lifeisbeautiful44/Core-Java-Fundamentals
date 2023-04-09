package java8.lambdas.parameters;

public class Test {
	public static void main(String[] args) {

		Sum s = (int x, int y) -> System.out.println("Sum of the numbers passed in parameter is: " + (x + y));
		s.add(4, 5);

	}
}
