package arrayPrograms;

public class Arrayprogram1 {

	public static void main(String[] args) {
		// replacing 0 , if it comes before 3..

		int a[] = { 3, 5, 3, 5, 3, 5, 9 };
		for (int i = 0; i < a.length -1; i++) {
			if (a[i] == 3 && a[i + 1] == 5) {
				a[i + 1] = 0;
			}
			System.out.print(a[i]);

		}
			}

}
