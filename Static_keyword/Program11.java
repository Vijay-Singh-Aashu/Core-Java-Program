package Static_keyword;

public class Program11 {
	static int i = 12;
	static int j;
	static {
		System.out.println("static-1: " + i + " " + j);
		j = test();
		System.out.println(i + " " + j);
	}

	public static void main(String[] args) {
		System.out.println("This is main Method");
		System.out.println(i + " " + j);
	}

	public static int test() {
		System.out.println("This is test Method " + i + " " + j);
		int i = 45;
		j = 88;
		System.out.println(i + " " + j);
		return i * 2;
	}

	static {
		System.out.println("static-2: " + i + " " + j);
	}
}
