import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class ReaderAndWriterDemo {

	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader(new File("/home/life_is_beautiful/Srijansil/Java/JavaLearning/Demo/file.txt"));
			System.out.println("File has opened..");
			// to write the file into another
			fw = new FileWriter(new File("/home/life_is_beautiful/Srijansil/Java/JavaLearning/Demo/new_file.txt"));
			
			int data;
			while((data = fr.read()) != -1)
			{
				fw.write(data);
				
			}
			System.out.println("File was successfully Written...");
			

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}finally
		{
			try {
				fr.close();
				System.out.println("Source file has been clsoed..");
				fw.close();
				System.out.println("Destination file has been closed..");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
