package wrapper_class;

public class Program2 {

	public static void main(String[] args) {
		int x = 34;

		Integer y = x;

		System.out.println(x + 16);
		System.out.println(y + 16);

		int p = 35;

		Integer q = new Integer(p); //outdated since jdk 9

		System.out.println(p);
		System.out.println(q);

	}

}
