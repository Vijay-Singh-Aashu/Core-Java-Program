package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		try {
			FileWriter fw1 = new FileWriter("d:\\java.txt");
			fw1.write("Today is a Christmas day Eve. Everybody " + "is enjoying but as I being "
					+ "a very sincere Student so " + "I am learning java");
			fw1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
