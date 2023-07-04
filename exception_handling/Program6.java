package exception_handling;

import java.io.FileInputStream;

public class Program6 {

	public static void main(String[] args) {

		Program6.test();
		System.out.println("FIle is found");
	}

	public static void test() {
		try {
			FileInputStream fis = new FileInputStream("d:/java.txt");
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
	}

}
