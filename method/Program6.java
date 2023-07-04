package method;

public class Program6 {
	public static void main(String[] args) {
		System.out.println("This is main method");
		findFactorial(10);
		findFactorial(11);
		findFactorial(8);
		findFactorial(12);
		System.out.println("main method ends");
	}

	public static void findFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(n + "! = " + fact);
	}
}
