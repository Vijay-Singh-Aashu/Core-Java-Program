package relationship_object;

public class Car_1 {
	String name;
	double price;
	Engine_1 e1;

	Car_1() {

	}

	Car_1(String name, double price, Engine_1 e1) {
		this.name = name;
		this.price = price;
		this.e1 = e1;
	}

	public void displayCar_1() {
		System.out.println("Car name is: " + name);
		System.out.println("Car price is: " + price);
		e1.displayEngine_1();
		System.out.println("=========================");
	}
}
