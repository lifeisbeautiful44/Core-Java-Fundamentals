package bufferreader;

import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class TryResourcesDemo {

	public static void main(String[] args) {

		int counter = 0;

		try (FileReader fr = new FileReader("/home/life_is_beautiful/Srijansil/Java/JavaLearning/Demo/file.txt");
				BufferedReader br = new BufferedReader(fr);) {

			String line;

			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					counter++;
				}
			}

			System.out.println("Total numbers of words are: " + counter);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
