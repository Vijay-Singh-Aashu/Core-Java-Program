package while_loop;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int i = 1;
		while (n != 0) {
			int rem = n % 10;
			System.out.println(rem);
			n = n / 10;
		}

	}

}
