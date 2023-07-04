package return_statement;

public class Program13 {

	public static void main(String[] args) {

		System.out.println(test());
		System.out.println("factorial is: " + Program8.print(8));
		System.out.println(Math.sqrt(128));
		System.out.println(Math.pow(12, 4));
		System.out.println(Math.PI);
		System.out.println(Math.min(23, 56));
		System.out.println(Math.max(23, 56));
		System.out.println(Math.ceil(23.56));
		System.out.println(Math.floor(23.56));
		System.out.println(Math.sin(23.56));
		System.out.println(Math.sinh(23.56));
		System.out.println(Math.exp(6));
		System.out.println(Math.log(23.56));

	}

	public static int test() {

		System.out.println("This is test method");
		return 12;
	}

}
