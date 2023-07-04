package static_non_static_class;

public class Driver {

	public static void main(String[] args) {
		Outer o1 = new Outer();
		System.out.println(o1.a);

		Outer.Inner i1 = new Outer.Inner();

		System.out.println(i1.b);
		i1.test();
	}
}
