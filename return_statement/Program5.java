package return_statement;

public class Program5 {
	public static void main(String[] args) {

		System.out.println(test());
	}

	public static String test() {

		System.out.println("This is test method");
		int a = 34;
		int b = 45;
		return a + "      " + b;

	}
}
