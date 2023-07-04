package string;

public class Program8 {

	public static void main(String[] args) {
		String s1 = "Moh4an i5s H34pp4y";
		int count = 0;
		char[] p = s1.toCharArray();

		for (char c : p) {
			System.out.println(c);
			count++;
		}
		System.out.println("Length of string is: " + count);

	}

}
