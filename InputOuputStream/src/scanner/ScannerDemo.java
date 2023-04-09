package scanner;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you id  , marks and name ");
		int id =  scan.nextInt();
		double marks =  scan.nextDouble();
		String name = scan.next();
		
		System.out.println("Your id is " + id);
		System.out.println("Your  marks is : " + marks);
		System.out.println("Hi Mr."+name);

		
		
		

	}

}
