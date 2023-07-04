package static_non_static_class;

public class Out_Inn {

	public static void main(String[] args) {
		Out o1 = new Out();
		System.out.println(o1.a);

		Out.Inn i1 = o1.new Inn();

		System.out.println(i1.b);
		i1.test();
	}
}
