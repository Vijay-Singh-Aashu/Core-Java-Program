package method;

public class Program1 {
	private static void demo() {

		System.out.println("This is demo method");
	}

	public static void main(String[] args) {
		System.out.println("This is main method");
		run();
		demo();
		run();
		run();
	}

	public static void run() {

		System.out.println("This is run method");
	}
}
