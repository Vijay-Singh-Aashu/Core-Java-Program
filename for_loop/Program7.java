package for_loop;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd Number: ");
		int c = sc.nextInt();
		for (int i = 1;; i++) {
			if (i % a == 0 && i % b == 0 && i % c == 0) {
				System.out.println("The LCM is: " + i);
				break;
			}
		}
		System.out.println("Program ends");

	}

}
