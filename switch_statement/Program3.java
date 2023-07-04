package switch_statement;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char p;
		do {
			System.out.println("Enter the 1st Number: ");
			int a = sc.nextInt();
			System.out.println("Enter the 2nd Number: ");
			int b = sc.nextInt();
			System.out.println("Enter the Operation to perform(+, -, *, / or %): ");
			char c = sc.next().charAt(0);
			switch (c) {
			case '+':
				System.out.println("The sum is: " + (a + b));
				break;
			case '-':
				System.out.println("The difference is: " + (a - b));
				break;
			case '*':
				System.out.println("The product is: " + (a * b));
				break;
			case '/':
				System.out.println("The Quotient is: " + (a / b));
				break;
			case '%':
				System.out.println("The remainder is: " + (a % b));
				break;
			default:
				System.out.println("This is not a valid operation");
			}
			System.out.println("Press Y to repeat or N to stop");
			p = sc.next().charAt(0);
		} while (p == 'Y' || p == 'y');
		System.out.println("Program is completed successfully");

	}

}
