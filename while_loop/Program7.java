package while_loop;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int i = 1;
		int count = 0;
		while (i <= n / 2) {
			if (n % i == 0) {
				System.out.print(i + "   ");
				count++;
			}
			i++;
		}
		System.out.println(" ");
		System.out.print("Total factors are: " + count);
	}

}
