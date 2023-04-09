package collections.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("F");
		list.add("A");
		list.add("Z");
		list.add("M");
		list.add("N");
		
		System.out.println("Before sorting: "+list);
		
	//	Collections.sort(list, new MyComparator());
		
		Collections.sort(list);
		
		System.out.println("After sorting: " + list );
		
		int binarySearch = Collections.binarySearch(list, "N");
		
		System.out.println("Index is: " + binarySearch);
		
		
		


	}

}
