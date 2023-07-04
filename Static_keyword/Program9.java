package Static_keyword;

public class Program9 {
	static int i = 12;

	public static void demo() {
		j = 45; // global
		int i = 84; // local
		System.out.println(i); // local
		System.out.println(j); // global
		test();
		System.out.println(i); // local
		System.out.println(j); // global
	}

	public static void main(String[] args) {
		System.out.println(i); // global
		System.out.println(j); // global
		i = 63; // global
		j = 74; // global
		System.out.println(i); // global
		System.out.println(j); // global
		demo();
		System.out.println(i); // global
		System.out.println(j); // global
		test();
		System.out.println(i); // global
		int i = 28; // local
		System.out.println(j); // global
		System.out.println(i); // local
		System.out.println(Program9.i); // global
	}

	static int j = 102;

	public static void test() {
		int i = 42; // local
		System.out.println(i); // local
		System.out.println(j); // global
		System.out.println(Program9.i); // global

	}
}
