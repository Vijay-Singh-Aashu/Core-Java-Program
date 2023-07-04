package var_args;

public class Program2 {
	public static void main(String[] args) {

		test(1232, 56, 5687, 567658, 457, 4578);

	}

	public static void test(int... x) {
		for (int a : x) {
			if (a >= 1000 && a <= 9999) {
				System.out.println(a);
			}
		}
	}
}
