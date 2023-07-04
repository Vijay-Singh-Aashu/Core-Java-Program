package string;

public class Program13 {

	public static void main(String[] args) {
		String s1 = new String("Monday").intern();

		String s2 = new String("Monday").intern();
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

	}

}
