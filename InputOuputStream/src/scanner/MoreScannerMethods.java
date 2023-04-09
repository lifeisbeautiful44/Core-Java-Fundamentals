package scanner;

import java.util.Scanner;

public class MoreScannerMethods {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter only numbers to caluclaute and type ok to get the sum.. ");
		
		int sum = 0;  
		 while (scan.hasNextInt())
		 {
			 int num = scan.nextInt();
			 sum += num;
		 }
		 
		 System.out.println(sum);
		
	}

}
