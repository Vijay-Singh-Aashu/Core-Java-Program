package array;

public class Prime_Number {
	public static void main(String[] args) {
		int[] a = { 38, 193, 17, 97, 576 };
		for (int i = 0; i < a.length; i++) {
			if (checkPrime(a[i])) {
				System.out.println(a[i]);
			}
		}
	}

	public static boolean checkPrime(int n) {
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}

	}

}
