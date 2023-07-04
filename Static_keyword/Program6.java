package Static_keyword;

public class Program6 {
	static int i = 51;
	static int j;

	public static void main(String[] args) {
		System.out.println(i); //global
		System.out.println(j); //global
		i = 63; //global
		j = 34; //global
		System.out.println(i); //global
		System.out.println(j); //global
		test();
		System.out.println(i); //global
		int i = 88; //local
		System.out.println(j); //global
		System.out.println(i); //local
		System.out.println(Program6.i); //global
	}

	public static void test() {
		System.out.println(i); //global
		i = 90; //global
		System.out.println(i); //global
		j = 78; //global
		int i = 32; //local
		System.out.println(i); //local
		System.out.println(Program6.i); //global
	}
}
