package string;

public class Program7 {

	public static void main(String[] args) {
		String s1 = "Moh4an i5s H34pp4y";
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
				System.out.println(s1.charAt(i));
				count++;
			}
		}
		System.out.println("Total number characters are: " + count);
	}

}
