package method_overriding;

public class ABCDDriver {
	public static void main(String[] args) {
		A a1 = new A();
		a1.drive();
		A a2 = new B();
		a2.drive();
		B b1= new D();
		b1.drive();
	}
}
