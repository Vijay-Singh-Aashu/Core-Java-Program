package Static_keyword;

public class Program8 {
	static int i = 72;

	public static void demo() {
		j = 45; // global
		int i = 34; // global
		System.out.println(i); // global
		System.out.println(j); // global
	}

	public static void main(String[] args) {
		System.out.println(i); // global
		System.out.println(j); // global
		i = 63; // global
		j = 34; // global
		System.out.println(i); // global
		System.out.println(j); // global
		test();
		demo();
		System.out.println(i); // global
		int i = 88; // local
		System.out.println(j); // global
		System.out.println(i); // local
		System.out.println(Program8.i); // global
	}

	static int j = 12;

	public static void test() {
		int i = 32; // local
		System.out.println(i); // local
		System.out.println(j); // global
		System.out.println(Program8.i); // global

	}
}
