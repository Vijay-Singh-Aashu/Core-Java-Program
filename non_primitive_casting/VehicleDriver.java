package non_primitive_casting;

public class VehicleDriver {
	public static void main(String[] args) {

		Vehicle v1 = new ElectricCar();
		System.out.println(v1.x);
		System.out.println("=================");
		Car c1 = new ElectricCar();
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println("=================");
		ElectricCar e1 = new ElectricCar();
		System.out.println(e1.x);
		System.out.println(e1.y);
		System.out.println(e1.z);
		System.out.println("=================");
		Vehicle v2 = new ElectricCar();
		ElectricCar e2 = (ElectricCar) v2;
		System.out.println(e2.x);
		System.out.println(e2.y);
		System.out.println(e2.z);
		System.out.println("=================");
		Car c2 = new ElectricCar();
		ElectricCar e3 = (ElectricCar) c2;
		System.out.println(e3.x);
		System.out.println(e3.y);
		System.out.println(e3.z);
		System.out.println("=================");
		Vehicle v3 = new Car();
		Car c3 = (Car) v3;
		System.out.println(c3.x);
		System.out.println(c3.y);
		

	}
}