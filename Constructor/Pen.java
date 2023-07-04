package Constructor;

public class Pen {
	String name;
	String color;
	int price;

	Pen() {

	}

	Pen(String name) {
		this();
		this.name = name;
	}

	Pen(String name, String color) {
		this(name);
		this.color = color;
	}

	Pen(String name, String color, int price) {
		this(name, color);
		this.price = price;
	}

	public void displayPen() {
		System.out.println("Pen name is: " + name);
		System.out.println("Pen color is: " + color);
		System.out.println("Pen price is: " + price);
		System.out.println("======================");
	}
}
