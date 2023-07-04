package Loop;

import java.util.Scanner;

public class Perfect_Number {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		do {
			if (n % i == 0) {
				System.out.println("The factor is: " + i);
				sum = sum + i;
			}
			i++;
		} while (i <= n / 2);
		if (sum == n) {
			System.out.println("The number is perfect number: " + n);
		} else {
			System.out.println("The number is not perfect number: " + n);
		}

	}
}
