package var_args;

public class Program3 {
	public static void main(String[] args) {

		test(23.56, "Mohan", 12, 56, 789, 457);
	}

	public static void test(double y, String z, int... x) {

		System.out.println(y);
		System.out.println(z);
		for (int a : x) {
			System.out.println(a);
		}

	}
}
