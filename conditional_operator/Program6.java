package conditional_operator;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		String x = (n % 100 == 23) ? "The no. ends with 23" : "The no. doesn't ends with 23 ";
		System.out.println(x);

	}

}
