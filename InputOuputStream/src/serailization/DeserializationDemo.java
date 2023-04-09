package serailization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(new File("/home/life_is_beautiful/Srijansil/Java/JavaLearning/Demo/emp.ser"));
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    
	    Object obj  = ois.readObject();
	    Employee emp = (Employee) obj ;
	    
	    System.out.println("Employer id : " +emp.id);
	    System.out.println("Employer Name : " +  emp.name);
	    System.out.println("Employer Salary : " + emp.salary);
	    System.out.println("Employer Ssn : "+  emp.ssn);
	    
	   

	    
	    
	}
}
