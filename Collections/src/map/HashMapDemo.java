package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put( "Srijan", 80 );
		map.put( "Rabo", 76);
		map.put( "Bharat", 100);
		map.put( "Sarad", 90);
		
		Set<String> keySet = map.keySet(); // Returns in the set
		System.out.println("Key: " + keySet);
		
		Collection<Integer> values = map.values();
		System.out.println("values " + values);
		System.out.println("Keys : " + "Values ");
		// to get the keys and values together we used foreach loop, 
		for(String key: keySet )
		{
			System.out.println(key + ": " + map.get(key));
		}

		
	}

}
