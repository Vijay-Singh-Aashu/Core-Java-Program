package file_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		try {
			FileWriter fw1 = new FileWriter("d:\\java.txt");
			fw1.write(s1);
			fw1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
