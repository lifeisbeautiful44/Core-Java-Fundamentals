package arrays.util;

import java.util.Arrays;

public class ArraysBinarySearchAssignment {
	
	public static void main(String[] args) {
		String[] s = {"A","S","C","Z","P"};
		
		int binarySearch = Arrays.binarySearch(s, "Z");
		
		System.out.println("The index of the Z is: "+binarySearch);
		
		
	}

}
