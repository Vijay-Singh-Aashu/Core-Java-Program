package object_class;

public class Program2 {

	public static void main(String[] args) {
		Object o1 = 34;
		Integer i = (Integer) o1;
		System.out.println(i + 100);

		Object o2 = 54.34;
		Double d = (Double) o2;
		System.out.println(d + 100);

	}

}
