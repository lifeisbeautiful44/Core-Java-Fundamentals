package concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySet extends Thread{
	static CopyOnWriteArraySet<String> arrayList = new CopyOnWriteArraySet<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		arrayList.add("Networking");

	}

	public static void main(String[] args) throws InterruptedException {

		ArraySet arraySet = new ArraySet();
		arraySet.start();

		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("Node");
		arrayList.add("Docker");

		Iterator<String> iterator = arrayList.iterator();

		while (iterator.hasNext()) {
			Thread.sleep(2000);
			String courses = iterator.next();
			System.out.println(courses);
		}

		System.out.println(arrayList);

	}

}
