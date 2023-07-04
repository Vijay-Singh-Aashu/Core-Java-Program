package conditional_operator;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		String x = (n % 8 == 0) ? "The No. is div by 8" : "The No. is not div by 8";
		System.out.println(x);

	}

}
