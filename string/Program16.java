package string;

public class Program16 {

	public static void main(String[] args) {
		String s1 = new String("Mohan is");
		s1 = s1.concat(" Happy");
		System.out.println(s1);
		String s2 = s1.concat(" Today");
		System.out.println(s1);
		System.out.println(s2);
		s2 = s1 + " Its Done!!";
		System.out.println(s1);
		System.out.println(s2);

	}

}
