package array;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		int size, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("The Students are in java: ");
		size = sc.nextInt();
		String[] a = new String[size];

		System.out.println("Enter Names : ");
		for (i = 0; i < size; i++) {
			a[i] = sc.next();
			a[i] += sc.nextLine();

		}
		System.out.println("Names Entered are : ");
		for (i = 0; i < size; i++) {
			System.out.println(a[i]);
		}
	}
}
