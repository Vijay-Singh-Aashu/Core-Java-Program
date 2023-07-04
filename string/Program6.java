package string;

public class Program6 {

	public static void main(String[] args) {
		String s1 = "Today is Monday";
		System.out.println(s1.charAt(2));
		System.out.println("=======for loop======");
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		System.out.println("======Even place characters=========");
		for (int i = 0; i < s1.length(); i++) {
			if (i % 2 == 0) {
				System.out.println(s1.charAt(i));
			}
		}

	}

}
