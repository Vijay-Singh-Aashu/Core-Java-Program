package static_non_static_class;

public class Out {

	int a = 12;

	class Inn {             // non_static_class
		int b = 20;

		public void test() {
			System.out.println(a + b);
		}
	}
}
