package string;

public class Program15 {

	public static void main(String[] args) {
		String s1 = new String("Monday");
		s1 = s1.intern();

		String s2 = new String("Monday");
		s2 = s2.intern();

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

	}

}
