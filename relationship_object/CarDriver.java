package relationship_object;

public class CarDriver {
	public static void main(String[] args) {
		Car c = new Car("Maruti", 183456.90);
		System.out.println("Car object address: " + c);
		System.out.println("Car engine object address: " + c.e);
		c.displayCar();

	}
}
