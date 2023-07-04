package Loop;

import java.util.Scanner;

public class Divisible_By_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			if (i % 7 == 0 || i % 10 == 7) {
				System.out.println(i);
			}
			i++;
		}
	}
}
