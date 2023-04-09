package arrayPrograms;

public class ArrayProgram2 {
	public static void main(String[] args) {
		// Printing the sum of array..

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of the two numbers by for loop is, " + sum);

		for (int i : a) {
			sum1 = sum1 + i;

		}
		System.out.println("Sum of the two numbers by for-each loop is, " + sum1);

	}

}
