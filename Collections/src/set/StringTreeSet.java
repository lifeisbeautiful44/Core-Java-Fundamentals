package set;

import java.util.TreeSet;

import comparator.StringComparator;

public class StringTreeSet {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<>(new StringComparator());

		set.add("abcas");
		set.add("xyzd");
		set.add("defdasdsa");
		set.add("mno");

		for (String obj : set) {

			System.out.println(obj);

		}

	}

}
