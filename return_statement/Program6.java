package return_statement;

public class Program6 {
	public static void main(String[] args) {

		System.out.println(test(10));
	}

	public static String test(int n) {
		if (n > 0) {
			return n + "      " + test(n - 1);
		} else {
			return "  ";
		}
	}
}
