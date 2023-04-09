package multithreading.assignments;

public class Test {

	public static void main(String[] args)  {
		EvenNumbersThread evenNumbersThread = new EvenNumbersThread();
		evenNumbersThread.start();
		
		OddNumbersThread oddNumbersThread = new OddNumbersThread();
        oddNumbersThread.start();
		


		for (int i = 1; i < 10; i++) {

			System.out.println(i);

		}

	}

}
