package method;

public class Program10 {
	public static int findFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(n + "! = " + fact);
		return fact;
	}

	public static int findPower(int a, int b) {
		int pow = 1;
		for (int i = 1; i <= b; i++) {
			pow = pow * a;
		}
		System.out.println(a + " to power " + b + " is: " + pow);
		return pow;
	}

	public static void main(String[] args) {
		int p = findFactorial(8) + findPower(6, 8);
		System.out.println("The sum is: " + p);

	}
}
