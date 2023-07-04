package for_loop;

public class Program8 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 5 || i == 8 || i == 3) {
				continue;
			}
			System.out.println("The i is: " + i);
		}
		System.out.println("Program ends");

	}

}
