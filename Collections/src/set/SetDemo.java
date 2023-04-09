package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* 
 The set which is an interface , doesnot allows to make and duplicate object .
*/
public class SetDemo {

	public static void main(String[] args) {

		Random randomNumbers = new Random();

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			int number = randomNumbers.nextInt(5);
			list.add(number);
		}

		System.out.println(list);
		Set<Integer> hashSet = new HashSet<>(list);
		
		System.out.println(hashSet);

	}

}
