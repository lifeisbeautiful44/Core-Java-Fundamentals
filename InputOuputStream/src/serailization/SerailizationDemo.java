package serailization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileNotFoundException;


public class SerailizationDemo {
	
	public static void main(String[] args) {
		
		FileOutputStream fos;
		ObjectOutputStream oos; // to write the object into file.
		
		try {
			fos = new FileOutputStream(new File("/home/life_is_beautiful/Srijansil/Java/JavaLearning/Demo/emp.ser"));
			oos = new ObjectOutputStream(fos);
			
			Employee emp = new Employee(1, "Srijansil", 100000, 44);
			oos.writeObject(emp);
			System.out.println("Object is written in the file");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
