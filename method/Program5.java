package method;

public class Program5 {
	public static void main(String[] args) {
		System.out.println("This is main method");
		findPower();
		findPower();
		findPower();
		findPower();
		System.out.println("main method ends");
	}

	public static void findPower() {
		int a = 12;
		int b = 5;
		int pow = 1;
		for (int i = 1; i <= b; i++) {
			pow = pow * a;
		}
		System.out.println(a + " to power " + b + " is: " + pow);
	}
}
