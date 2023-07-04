package Static_keyword;

public class Program15 {
	static int i = test();
	static int j = 20;;
	static int k;
	static {
		System.out.println("This is static block " + i + " " + j + " " + k);
		j = test();
		System.out.println(i + " " + j + " " + k);
		k = test() - demo();
		System.out.println(i + " " + j + " " + k);
	}

	public static void main(String[] args) {
		System.out.println("This is main Method!!");
		System.out.println(i + " " + j + " " + k);
		int x = sum();
		System.out.println(i + " " + j + " " + k);
	}

	static int test() {
		System.out.println("This is test()");
		System.out.println(i + " " + j + " " + k);
		return 120;
	}

	static int demo() {
		i = 65;
		j = 23;
		System.out.println("This is demo()");
		System.out.println(i + " " + j + " " + k);
		return 20;
	}

	static int sum() {
		i = 35;
		j = 300;
		System.out.println("This is demo()");
		System.out.println(i + " " + j + " " + k);
		return 200;
	}

}
