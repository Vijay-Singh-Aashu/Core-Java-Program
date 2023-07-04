package flow_control_statement;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the 1st number: ");
		int a = sc.nextInt();
		System.out.println("ENter the 2nd number: ");
		int b = sc.nextInt();
		System.out.println("ENter the 3rd number: ");
		int c = sc.nextInt();
		System.out.println("ENter the 4th number: ");
		int d = sc.nextInt();
		if (a > b && a > c && a > d) {
			System.out.println("a is biggest");
		} else if (b > c && b > d) {
			System.out.println("b is biggest");
		} else if (c > d) {
			System.out.println("c is biggest");
		} else if (d > c) {
			System.out.println("d is biggest");
		} else {
			System.out.println("All are equal");
		}

	}

}
