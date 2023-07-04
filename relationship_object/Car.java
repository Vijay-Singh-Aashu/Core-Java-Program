package relationship_object;

public class Car {
	String name;
	double price;
	Engine e = new Engine(60, 6, "Diesel");

	Car() {

	}

	Car(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void displayCar() {
		System.out.println("Car name is: " + name);
		System.out.println("Car price is: " + price);
		e.display();
	}
}
