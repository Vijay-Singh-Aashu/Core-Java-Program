package string;

public class Program21 {

	public static void main(String[] args) {
		String s1 = "Today is a good day";
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('a', 8));

		System.out.println("==================");
		System.out.println(s1.indexOf("ay"));

		System.out.println(s1.indexOf("ay", 8));

	}

}
