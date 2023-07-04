package for_loop;

public class Program9 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0 || i % 10 == 7) {
				continue;
			}
			System.out.println("The i is: " + i);
		}
		System.out.println("Program ends");

	}

}
