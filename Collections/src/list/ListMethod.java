package list;

import java.util.ArrayList;
import java.util.List;

/*
    Different types of Methods:
	1. add()       -> add object to the list
	2. set()       -> replacing the object
	3. addall()    -> adding one list object to another list
	4. contains()  -> searching whether the list contains, the object or not, returns boolean value.
	5. size()      -> will get return the current size of the list.
	6. remove()    -> remove the current index element on the list.
	*/

public class ListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>(); // Runtime, polymorphism.

		for (int i = 10; i <= 100; i = i + 10) {
			list.add(i); // adding elements to the list
		}

		System.out.println(list);

		list.add(5, 5); // adding element to a particular index.
		System.out.println("List after adding the elements: " + list);

		list.set(5, 6); // replacing element to a particular index/
		System.out.println("List after replacing at particular elements: " + list);

		List<Integer> secondList = new ArrayList<Integer>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(444);

		System.out.println(secondList);

		// adding one list to another list by addall() mehtods.

		list.addAll(4, secondList);
		System.out.println("After adding second list to the firrst list: " + list);

		// seraching particular object in the list

		if (list.contains(444)) {
			System.out.println("Found in the list.");
		} else {
			System.out.println("Could not find it.");
		}
		
		System.out.println("Elements of the list");
        
		for(int i =0; i<list.size(); i++)  //sizE() wiill get return the current size of the list.
		{
			System.out.println("First elements at index "+ i + " is "+ list.get(i));
		}
		
		list.remove(5);     // will remove the current index element on the list.
		System.out.println("After removing elements : " + list);
	}

}
