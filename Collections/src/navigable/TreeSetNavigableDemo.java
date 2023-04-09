package navigable;

import java.util.TreeSet;

public class TreeSetNavigableDemo {

	public static void main(String[] args) {
		

		TreeSet<Integer> tSet = new TreeSet<>();
		
		tSet.add(10);
		tSet.add(20);
		tSet.add(35);
		tSet.add(40);
		tSet.add(15);
		tSet.add(30);
		tSet.add(45);
		
		System.out.println(tSet);
		System.out.println(tSet.ceiling(16)); //returns the least element greater than or equal to e
		System.out.println(tSet.higher(20));  //returns the least element greater than e
		System.out.println(tSet.floor(14));   //returns the greatest element less than or equal to 
		System.out.println(tSet.lower(35));   // returns the greatest element less than e
		System.out.println(tSet.pollFirst());
		System.out.println(tSet.pollLast());
		System.out.println(tSet.descendingSet());

		
	}

}
