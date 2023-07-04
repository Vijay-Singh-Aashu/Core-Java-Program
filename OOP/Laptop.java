package OOP;

public class Laptop {
	String name;
	int price;
	double storage;

	Laptop(String n, int p, double s) {
		name = n;
		price = p;
		storage = s;
	}

	public void dispalyLaptop() {
		System.out.println("Laptop name is: " + name);
		System.out.println("Laptop price is: " + price);
		System.out.println("Laptop storage is: " + storage);
		System.out.println("===========================");
	}
	
}
