package checkedexecption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/* 
  Normaly, when we used throws in the function,
  it means we are not handling the exception, the caller function need,
  to handle the exception
*/
public class Checked {
	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("");
	}

	public static void main(String[] args) {
		Checked ch = new Checked();
		try {
			ch.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

		System.out.println("checking");
	}
}
