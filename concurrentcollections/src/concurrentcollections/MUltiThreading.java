package concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MUltiThreading extends Thread {
	static CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		arrayList.add("MultiThread Scenario");

	}

	public static void main(String[] args) throws InterruptedException {

		MUltiThreading mUltiThreading = new MUltiThreading();
		mUltiThreading.start();

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
