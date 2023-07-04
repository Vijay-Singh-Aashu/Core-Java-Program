package method;

public class Program4 {
	public static void main(String[] args) {
		System.out.println("This is main method");
		findFactorial();
		findFactorial();
		findFactorial();
		findFactorial();
		System.out.println("main method ends");
	}

	public static void findFactorial() {
		int n = 10;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(n + "! = " + fact);
	}
}
