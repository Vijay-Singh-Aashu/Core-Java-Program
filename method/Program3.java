package method;

public class Program3 {
	public static void test() {
		System.out.println("This is test method");
		System.out.println("Inside test method");
		demo();
		System.out.println("test method ends");
	}

	public static void main(String[] args) {
		demo();
		System.out.println("This is main method");
		test();
		System.out.println("main method ends");
		demo();
	}

	public static void demo() {
		System.out.println("This is demo method");
		System.out.println("demo method ends");

	}
}
