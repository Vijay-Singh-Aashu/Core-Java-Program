package file_handling;

import java.io.File;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) {
		File f1 = new File("d:\\test.java");

		System.out.println("Inside try block");
		try {
			f1.createNewFile();
			System.out.println("File is Created");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.getName());
		System.out.println(f1.getPath());
		System.out.println(f1.length());
		System.out.println("Program Ends");
	}

}
