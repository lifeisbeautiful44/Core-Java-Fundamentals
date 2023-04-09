package bufferreader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class BufferReaderDemo {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		int counter = 0;

		try {

			fr = new FileReader("/home/life_is_beautiful/Srijansil/Java/JavaLearning/Demo/file.txt");
			br = new BufferedReader(fr);

			String line;
			//System.out.println(br.readLine());  br.readLine() , returns string , till the new line...

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
		} finally {
			try {
				fr.close();
				System.out.println("Source file is closed..");
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
