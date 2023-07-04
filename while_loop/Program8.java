package while_loop;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int i = 1;
		int count = 0;
		while (i <= n ) {
			System.out.println("Loop iteration is: " + i);
			if (n % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 2) {
			System.out.println(n + "  is a prime Number ");
		} else {
			System.out.println(n + "  is not a prime Number ");
		}

	}

}
