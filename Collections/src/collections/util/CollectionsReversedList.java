package collections.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReversedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(50);
		l.add(15);
		l.add(18);
		l.add(90);
		l.add(1);
		
		System.out.println("Before Reversing: " + l);
		
		Collections.reverse(l);
		
		System.out.println("After Reversing: "+ l);

		
	}

}
