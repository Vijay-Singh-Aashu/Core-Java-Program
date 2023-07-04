package methodOverloading;

public class Calculator {
	public static void main(String[] args) {
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 23.50);
	}

	public static void sum(int a, int b) {
		System.out.println("int, int type method");
		System.out.println("The sum is: " + (a + b));
	}

	public static void sum(int a, int b, int c) {
		System.out.println("int, int, int type method");
		System.out.println("The sum is: " + (a + b + c));
	}

	public static void sum(int a, double b) {
		System.out.println("int, double type method");
		System.out.println("The sum is: " + (a + b));
	}

	public static void sum(double a, int b) {
		System.out.println("double, int type method");
		System.out.println("The sum is: " + (a + b));
	}

	public static void sum(double a, double b, double c) {
		System.out.println("double a, double b, double type method");
		System.out.println("The sum is: " + (a + b + c));
	}
}
