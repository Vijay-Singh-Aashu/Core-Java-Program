package inheritance;

public class CarDriver {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		System.out.println(v1.a);
		v1.test();
		System.out.println("=============");
		
		Car c1 = new Car();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.test();
		c1.demo();
	}

}
