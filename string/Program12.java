package string;

public class Program12 {

	public static void main(String[] args) {
		String s1 = new String("Monday");
		String s2 = new String("monday");
		String s3 = new String("Monday");

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("=============");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println("================");
		System.out.println(s1.equalsIgnoreCase(s2));

	}

}
