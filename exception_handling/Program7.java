package exception_handling;

public class Program7 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main starts");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(2400);
		}

		System.out.println("main ends");
	}

}
