package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		File f1 = new File("d:\\Program1.java");

		try {
			Scanner sc = new Scanner(f1);
			while (sc.hasNextLine()) {
				String p = sc.nextLine();
				System.out.println(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
