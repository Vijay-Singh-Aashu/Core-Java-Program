package static_non_static_class;

public class Outer {

	static int a = 12;

	static class Inner {         // static class
		int b = 20;

		public void test() {
			System.out.println(a + b);
		}
	}
}
