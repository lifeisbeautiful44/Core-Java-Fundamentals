package map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHasMapDemo {
	
	public static void main(String[] args) {
		 
		Map<Integer, String> map = new IdentityHashMap<>();
		
		map.put(1 ,  "Srijansil");
		map.put(2,"Srijansil");
		
		System.out.println(map);
		
		
	}

}
