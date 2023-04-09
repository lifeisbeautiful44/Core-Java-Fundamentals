package list.iterator;

import java.util.ListIterator;
import java.util.LinkedList;

public class ListItreatorDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("Srijansil");
		list.add("Java");
		list.add("Developer");

		System.out.println(list);

		ListIterator<String> itr = list.listIterator();

		System.out.println("Traversing in forward directions: ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Traversing in Backward  directions: ");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
