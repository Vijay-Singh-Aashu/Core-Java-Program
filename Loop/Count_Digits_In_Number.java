package Loop;

import java.util.Scanner;

public class Count_Digits_In_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		System.out.println("Count number is: " + count);
	}

}
