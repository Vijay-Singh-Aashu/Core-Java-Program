package Constructor;

public class Smart_Phone {
	String name;
	int storage;
	double price;

	Smart_Phone(String name) {
		this.name = name;
	}

	Smart_Phone(String name, int storage) {
		this(name);
		this.storage = storage;
	}

	Smart_Phone(String name, int storage, double price) {
		this(name, storage);
		this.price = price;
	}

	public void displaySmart_Phone() {
		System.out.println("Smart_Phone name is: " + name);
		System.out.println("Smart_Phone storage is: " + storage);
		System.out.println("Smart_Phone price is: " + price);
		System.out.println("==============================");
	}
}
