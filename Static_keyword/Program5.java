package Static_keyword;

public class Program5 {
	static int i = 10;
	static int j = test();

	public static void main(String[] args) {
		System.out.println("This is main Method");
		System.out.println(i + " " + j);
		int p = test();
		System.out.println(i + " " + j + " " + p);
	}

	public static int test() {
		System.out.println("This is test method");
		System.out.println(i + " " + j);
		int i = 56;
		j = 80;
		System.out.println(i + " " + j);
		return i + 12;
	}
}
