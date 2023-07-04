package polymorphism;

public class ABCDDriver {
	public static void main(String[] args) {
		A a = new A();
		a.test();
		System.out.println(a.x);
		System.out.println(a.y);

		B b = new B();
		b.test();
		System.out.println(b.x);
		System.out.println(b.y);

		C c = new C();
		c.test();
		System.out.println(c.x);
		System.out.println(c.y);
		
		D d = new D();
		d.test();
		System.out.println(d.x);
		System.out.println(d.y);
	}

}
