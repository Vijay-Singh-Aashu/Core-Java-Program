package Static_keyword;

public class Program13 {
	static int i = 20;
	static int j;
	static int k;
	static {
		j = 45;
		k = test();
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println(i + " " + j + " " + k);
	}

	public static int test() {
		System.out.println("This is test Method");
		return 100;
	}
}
