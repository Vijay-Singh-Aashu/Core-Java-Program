package method;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the base value: ");
		int x = sc.nextInt();
		System.out.println("ENter the exponent value: ");
		int y = sc.nextInt();
		findPower(x, y);
		System.out.println("main method ends");
	}

	public static void findPower(int a, int b) {
		int pow = 1;
		for (int i = 1; i <= b; i++) {
			pow = pow * a;
		}
		System.out.println(a + " to power " + b + " is: " + pow);
	}
}
