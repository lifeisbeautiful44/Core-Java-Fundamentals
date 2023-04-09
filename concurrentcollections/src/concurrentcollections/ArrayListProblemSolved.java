package concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblemSolved {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<String>();
		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("Node");
		arrayList.add("Docker");

		Iterator<String> iterator = arrayList.iterator();

		while (iterator.hasNext()) {
			String courses = iterator.next();
			System.out.println(courses);
			// arrayList.add("Concurrent Modification Exception");
			if (courses.equals("Docker")) {
				arrayList.remove(courses);
			}
			
		}
		System.out.println(arrayList);


	}

}
