package Loop;

import java.util.Scanner;

public class Sum_Of_N_Even_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= n) {
			if (i % 2 == 0) {
				sum = sum + i;

			}
			i++;

		}
		System.out.println("Sum of Even Numbers: " + sum);
	}
}