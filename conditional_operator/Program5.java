package conditional_operator;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		String x = (n % 10 == 7) ? "The last digit is 7" : "The last dig. is not 7";
		System.out.println(x);

	}

}
