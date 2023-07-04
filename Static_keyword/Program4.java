package Static_keyword;

public class Program4 {
	static int i = 10;
	static int j;

	public static void main(String[] args) {
		System.out.println("This is main Method");
		System.out.println(i + " " + j);
		test();
		System.out.println(i + " " + j);
	}

	public static void test() {
		System.out.println("This is test method");
		System.out.println(i + " " + j);
		int i = 56;
		j = 80;
		System.out.println(i + " " + j);
	}
}
