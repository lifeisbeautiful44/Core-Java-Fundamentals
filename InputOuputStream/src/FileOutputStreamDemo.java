import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamDemo {

	
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try
		{
			//To open(read the file) the file. FileInputStream throws and FileNotFoundException, which is an Checked Exception..
			fis =  new FileInputStream(new File("/home/life_is_beautiful/Srijansil/Java/JavaLearning/Demo/demo.jpg"));
			System.out.println("File has opened.");
			//File to open for writing in the file.
			fos = new FileOutputStream(new File("/home/life_is_beautiful/Srijansil/Java/JavaLearning/Demo/new_image.jpg"));
			int data; // becuase fos.read() -> returns the data in byte
			while((data = fis.read()) != -1)
			{
				fos.write(data);
			}
			System.out.println("File has been successfully Copied..");
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				System.out.println("Source file is closed.");
				fos.close();
				System.out.println("Destination file is closed.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
