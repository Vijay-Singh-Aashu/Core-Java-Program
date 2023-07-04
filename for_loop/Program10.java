package for_loop;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n = sc.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(n + " * " + i + " = " + (n * i));
			i++;
		}

	}

}
