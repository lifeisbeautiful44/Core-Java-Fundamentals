package set;

import java.util.Iterator;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

/*
 The three different Set class are : 
	1. Hashset class, a hash set does not maintain the order.
	2. LinkedHashSet class, maintains the order.
	3. TreeSet class,maintains the order in ascending order by default.
*/
public class DifferentSets {

	public static void main(String[] args) {

		Random randomNumbers = new Random();

//		HashSet<Integer> set = new HashSet<>();

//		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		TreeSet<Integer> set = new TreeSet<>();

		for (int i = 1; i <= 5; i++) {

			int number = randomNumbers.nextInt(50);
			set.add(number);
			System.out.println(number);

		}
//		System.out.println("The elements on the HashSet: " + hashSet);
//		System.out.println("The elements on the Linked HashSet: " + set);
		System.out.println("The elements on the TreeSet: " + set);
		
		
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println( itr.next());
			itr.remove();
		}
		
		System.out.println(set);

		
		

	}

}
