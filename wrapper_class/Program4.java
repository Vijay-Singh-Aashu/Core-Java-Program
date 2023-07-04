package wrapper_class;

public class Program4 {

	public static void main(String[] args) {
		Integer p = 345;// 1
		System.out.println(p + 100);

		String s = p.toString();// 1
		System.out.println(s + 100);

		int k = 560;
		Integer l = k;
		String s1 = l.toString();
		System.out.println(s1 + 100);

		Double e = 23.56;// 2
		String s2 = e.toString();// 2
		System.out.println(s2 + 100);

	}

}
