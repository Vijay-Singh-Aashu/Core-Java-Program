package polymorphism;

public class Calculator {
	Calculator()
	{
		System.out.println("No arg constructor");
	}

	Calculator(int a)
	{
		System.out.println("int parametr constructor");
	}

	public static void sum(int a, int b) {
		System.out.println("two parameter int, int sum()");
		System.out.println("The sum is: " + (a + b));
	}

	public static void sum(int a, double b) {
		System.out.println("two parameter int, double sum()");
		System.out.println("The sum is: " + (a + b));
	}

	public static void sum(int a, int b, int c) {
		System.out.println("three parameter int, int, int sum()");
		System.out.println("The sum is: " + (a + b + c));
	}
}
