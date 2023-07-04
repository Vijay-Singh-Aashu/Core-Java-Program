package switch_statement;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char p;
		do {
			System.out.println("Enter the character ");
			char c = sc.next().charAt(0);
			switch (c) {
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'u':
			case 'U':
				System.out.println("This is a vowel");
				break;
			default:
				System.out.println("This is not a Vowel character");
			}
			System.out.println("Press Y to repeat or N to stop");
			p = sc.next().charAt(0);
		} while (p == 'Y' || p == 'y');
		System.out.println("Program is completed successfully");

	}

}
