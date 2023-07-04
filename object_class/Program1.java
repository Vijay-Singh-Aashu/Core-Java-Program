package object_class;

public class Program1 {

	public static void main(String[] args) {
		Object x = 12;
		Integer y = (Integer) x;
		System.out.println(y + 100);

		String s1 = new String("Mohan");
		String s2 = "Sohan";
		String s3 = new String("Mohan");

		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

	}

}
