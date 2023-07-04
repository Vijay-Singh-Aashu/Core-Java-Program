package Loop;

import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int count = 0;
		while (i <= n / 2) {
			if (n % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 1) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}
}
