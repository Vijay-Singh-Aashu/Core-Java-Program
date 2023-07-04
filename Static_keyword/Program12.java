package Static_keyword;

public class Program12 {
	static int i = 34;
	static int j;
	static {
		j = 86;
		System.out.println(i);
		System.out.println("This is static block1");
		System.out.println(j);
	}

	public static void main(String[] args) {
		System.out.println("This is main Method");
		System.out.println(i);
		System.out.println(j);
	}

	static {
		i = 81;
		System.out.println("This is static block2");
		System.out.println(i);
	}

}
