package navigable;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NabigableTreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableMap<String, String> map = new TreeMap<>();

		map.put("a", "A11");
		map.put("b", "z22");
		map.put("c", "e22");
		map.put("d", "h22");
		map.put("e", "k22");
	//	map.put("f", "b22");
		map.put("g", "d22");
		map.put("h", "d22");

		System.out.println(map);

		System.out.println(map.floorKey("f"));
		// output must be f , becuase it returns the the greatest key less than or equal to f,
		System.out.println(map.lowerKey("d"));
        // output  must be c  , it rueturns the greatest key less than the k
		System.out.println(map.ceilingKey("d"));
        // output must be d, least key greater or the equal to d
		System.out.println(map.higherKey("g"));
        // output must be h, least key greater thgan g is h
		System.out.println(map.pollFirstEntry());
		System.out.println(map.pollLastEntry());
		System.out.println(map.descendingMap());

	}

}
