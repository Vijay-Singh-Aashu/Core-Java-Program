package wrapper_class;

public class Program3 {

	public static void main(String[] args) {
		Integer a = 234;
		int b = a;
		System.out.println(a);
		System.out.println(b);

		int i = 45;
		int j = Integer.valueOf(i);

		System.out.println(Integer.toHexString(i).toUpperCase());

	}

}
