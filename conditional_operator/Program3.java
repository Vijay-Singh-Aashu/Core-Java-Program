package conditional_operator;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		String x = (n % 7 == 0) ? "The No. is div by 7" : "The No. is not div by 7";
		System.out.println(x);

	}

}
