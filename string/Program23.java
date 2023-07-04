package string;

public class Program23 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mohan");

		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.charAt(2));
		System.out.println(sb.deleteCharAt(3));
		System.out.println(sb);

		StringBuffer sb1 = new StringBuffer("Mohan");
		StringBuffer sb2 = new StringBuffer("Mohan");
		sb2 = sb1.append("Singh");
		new StringBuffer();
		System.out.println(sb1.equals(sb2));
	}

}
