import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a, b;
		try {
		System.out.println("enter two numbers");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("Result = " + a % b);
		scan.close();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("I will be printed, whether there is an execption or not. ^^");
		}

	}

}
