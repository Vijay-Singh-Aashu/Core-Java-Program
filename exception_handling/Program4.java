package exception_handling;

public class Program4 {

	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			throw new ArithmeticException();
		} catch (Exception e) {
			System.out.println("exception caught");
		}

		System.out.println("main ends");
	}

}
