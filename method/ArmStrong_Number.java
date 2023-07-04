package method;

public class ArmStrong_Number {
	public static int countDigit(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;

		}
		return count;
	}

	public static int findPower(int a, int b) {
		int pow = 1;
		for (int i = 1; i <= b; i++) {
			pow = pow * a;

		}
		return pow;
	}

	public static void main(String[] args) {
		int n = 153;
		int p = n;
		int sum = 0;
		int q = countDigit(n);
		while (n != 0) {

			int rem = n % 10;
			sum = sum + findPower(rem, q);
			n = n / 10;
		}
		if (p == sum) {
			System.out.println("This is Armstrong Number");
		} else {
			System.out.println("This is not Armstrong Number");
		}

	}
}
