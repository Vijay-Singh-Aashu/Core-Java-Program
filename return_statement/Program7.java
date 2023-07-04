package return_statement;

public class Program7 {
	public static void main(String[] args) {

		System.out.println(test(100));
	}

	public static int test(int n) {
		if (n > 1) {
			return n + test(n - 1);
		} else {
			return 1;
		}
	}
}
