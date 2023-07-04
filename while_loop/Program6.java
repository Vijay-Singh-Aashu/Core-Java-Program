package while_loop;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n / 2) {
			if (n % i == 0) {
				System.out.print(i + "   ");
			}
			i++;
		}

	}

}
