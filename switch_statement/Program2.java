package switch_statement;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("This is case-1");

		case 2:
			System.out.println("This is case-2");

		case 3:
			System.out.println("This is case-3");

		case 4:
			System.out.println("This is case-4");

		case 5:
			System.out.println("This is case-5");

		default:
			System.out.println("This is default case");
		}

	}

}
