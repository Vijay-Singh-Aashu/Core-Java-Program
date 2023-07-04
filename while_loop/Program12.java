package while_loop;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int i = 1;
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		System.out.println("Total digits are: " + count);

	}

}
