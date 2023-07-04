package method;

public class StrongNumber {
	public static int findFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int n = 145;
		int a = n;
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			int x = findFactorial(rem);
			sum = sum + x;
			n = n / 10;
		}
		if (a == sum) {
			System.out.println("This is Strong Number");
		} else {
			System.out.println("This is not Strong Number");
		}
	}
}
