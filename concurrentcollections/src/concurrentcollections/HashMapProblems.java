package concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapProblems extends Thread {
	static ConcurrentHashMap<String, Float> hashMap = new ConcurrentHashMap<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		hashMap.put("Aws", 7f);

	}

	public static void main(String[] args) throws InterruptedException {

		HashMapProblems solved = new HashMapProblems();
		solved.start();

		hashMap.put("Java", 5.0f);
		hashMap.put("Python", 4.5f);
		hashMap.put("NodeJS", 4f);
		hashMap.put("PHP", 3.9f);

		Iterator<String> iterator = hashMap.keySet().iterator();

		while (iterator.hasNext()) {
			Thread.sleep(2000);
			String courses = iterator.next();
			System.out.println(courses + " " + hashMap.get(courses));

		}

		System.out.println(hashMap);

	}

}
