package Loop;

import java.util.Scanner;

public class Factor_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int count = 0;
		while (i <= n / 2) {
			if (n % i == 0) {
				System.out.print(i+" ");
				count++;
			}
			i++;
		}
		System.out.println();
		System.out.println("Total Factors are: " + count);

	}

}
