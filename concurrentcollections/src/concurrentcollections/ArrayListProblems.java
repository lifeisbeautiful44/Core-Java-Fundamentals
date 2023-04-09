package concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrayList = new ArrayList<String>();
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

	}

}
