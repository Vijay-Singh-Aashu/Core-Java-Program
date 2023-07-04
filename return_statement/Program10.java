package return_statement;

public class Program10 {
	public static void main(String[] args) {
		System.out.println("This is main method");
		test(1);
		System.out.println("main method ends");
	}

	public static void test(int n) {
		if (n <= 10) {
			System.out.println(n);
			test(n + 1);
		}
		System.out.println("Tahnk You!! It's Over!! and n is: " + n);

	}
}
