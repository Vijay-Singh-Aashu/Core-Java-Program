package method;

import java.util.Scanner;

public class Program9 {
	public static void digitSum(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("The sum of digit is: " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the base value: ");
		int n = sc.nextInt();
		digitSum(n);

	}
}
