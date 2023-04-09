import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("/home/life_is_beautiful/Srijansil/Java/JavaLearning/Demo/file.txt"));
			System.out.println("File Opened");
			int i;
			i = fis.read();

			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		finally {
			try {
				fis.close();
				System.out.println("File closed");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
