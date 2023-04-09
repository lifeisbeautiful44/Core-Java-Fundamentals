package set;

import java.util.TreeSet;

import comparator.StringBufferComparator;

public class StringBufferSet {

	public static void main(String[] args) {

		TreeSet<StringBuffer> set = new TreeSet<>(new StringBufferComparator());

		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("mno"));
		set.add(new StringBuffer("defs"));
		

		for (StringBuffer obj : set) {

			System.out.println(obj);

		}

	}

}
