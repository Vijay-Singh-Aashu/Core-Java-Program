package var_args;

public class Program1 {
	public static void main(String[] args) {
		sum(23.6, 56);
		sum(34.6, 78.9, 67);
		sum(10, 30, 67, 56, 45, 67, 45, 9);

		int[] p = { 23, 67, 87, 56, 89 };
		test(p);

	}

	public static void sum(double... a) {
		double sum = 0;
		for (double x : a) {
			sum = sum + x;
		}
		System.out.println("The sum is: " + sum);
	}

	public static void test(int[] a) {
		int sum = 0;
		for (int x : a) {
			sum = sum + x;
		}
		System.out.println("The sum is: " + sum);
	}

}
