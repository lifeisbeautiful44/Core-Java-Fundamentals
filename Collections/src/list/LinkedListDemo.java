package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	
	public static void main(String[] args) {
		Object obj[] = new Object[1000000];
		
		

		for (int i = 0; i < obj.length; i++) {
			obj [i] = new Object();
		}
		
		List<Object> list = new LinkedList<>();
		
		long start = System.currentTimeMillis();
		for (Object element : obj) {
			list.add(element);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken to add: " + (end -start));
		
		
		

	}

}
