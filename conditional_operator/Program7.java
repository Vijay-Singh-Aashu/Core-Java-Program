package conditional_operator;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char c = sc.next().charAt(2);
		String x = (c == 'A' || c == 'a' || c == 'E' || c == 'e') ? "Vowl. Ch" : "Not Vowel ch.";
		System.out.println(x);

	}

}
