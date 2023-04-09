package arrays.util;

import java.util.Arrays;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		int[] a = { 45, 2, 56, 10, 5 };

		System.out.println("Before Sorting: ");

		for (int elements : a) {
			System.out.println(elements);
		}

		Arrays.sort(a);

		System.out.println("After sorting: ");
		for (int elements : a) {
			System.out.println(elements);
		}

		String[] s = { "A", "S", "C", "Z", "P" };
		System.out.println("Before using custom comparator");
		for (String string : s) {
			System.out.println(string);
		}

		Arrays.sort(s, new MyComparator());

		System.out.println("After using custom comparator");
		for (String string : s) {
			System.out.println(string);
		}
		
		List<String> list = Arrays.asList(s);  //Array into list, by asList() method.
		s[1] ="Srijasnil";
		
		/*
		    Whenever you changes you make to the list will reflect on the array, and
		    whatever chnages you make to the array will relfect on the list.
		 */
		System.out.println(list);

	}

}
