package Loop;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 1;
		int pow = 1;
		while (i <= b) {
			pow = pow * a;
			i++;
		}
		System.out.println(a + " to power " + b + " is: " + pow);

	}
}
