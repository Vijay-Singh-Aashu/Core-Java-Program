package string;

public class Program10 {

	public static void main(String[] args) {
		String s1 = "    Moh4an i5s H3 4ppm 4y     ";
		System.out.println(s1);
		s1.trim();
		System.out.println("===============");
		System.out.println(s1.trim());
		String s2 = s1.trim();
		System.out.println(s1);
		System.out.println(s2);

	}

}
