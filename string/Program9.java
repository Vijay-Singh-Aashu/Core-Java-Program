package string;

public class Program9 {

	public static void main(String[] args) {
		String s1 = "Moh4an i5s H3 4ppm 4y";
		int count = 0;
		char[] p = s1.toCharArray();
		for (char c : p) {
			if (c != ' ') {
				count++;
			}
		}
		System.out.println("Length of string is: " + count);

	}

}
