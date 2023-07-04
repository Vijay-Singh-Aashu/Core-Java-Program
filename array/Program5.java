package array;

public class Program5 {
	public static void main(String[] args) {
		int[] a = { 12, 18, 6, 24, 28, 142 };
		for (int x : a) {
			if (checkPerfect(x)) {
				System.out.println(x);
			}
		}

	}

	public static boolean checkPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (n == sum) {
			return true;
		} else {
			return false;
		}
	}
}
