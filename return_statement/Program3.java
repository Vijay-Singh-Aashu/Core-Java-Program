package return_statement;

public class Program3 {
	public static void main(String[] args) {

		System.out.println(test());
	}

	public static int test() {

		System.out.println("This is test method");
		return 12 + 325 * 2 / 5 % 30;
	}
}
