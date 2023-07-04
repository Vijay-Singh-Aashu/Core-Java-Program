package method;

public class Program7 {
	public static void main(String[] args) {
		System.out.println("This is main method");
		findPower(12, 5);
		findPower(16, 4);
		findPower(8, 7);
		findPower(17, 3);
		System.out.println("main method ends");
	}

	public static void findPower(int a, int b) {
		int pow = 1;
		for (int i = 1; i <= b; i++) {
			pow = pow * a;
		}
		System.out.println(a + " to power " + b + " is: " + pow);
	}
}
