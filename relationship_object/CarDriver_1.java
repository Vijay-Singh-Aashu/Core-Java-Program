package relationship_object;

public class CarDriver_1 {
	public static void main(String[] args) {
		Car_1 c1 = new Car_1("Honda", 695000, new Engine_1(80, 8, "Petrol"));
		Car_1 c2 = new Car_1("Swift", 595000, new Engine_1(55, 7, "Diesel"));
		c1.displayCar_1();
		c2.displayCar_1();
	}
}
