package conditional_operator;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		String x = (n % 2 == 0) ? "The No. ie Even" : "The No. is Odd";
		System.out.println(x);
	}

}
