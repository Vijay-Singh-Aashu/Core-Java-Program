package OOP;

class Fruits {
	String name;
	int price;
	double weight;

	public void setValue(String n, int p, double w) {
		name = n;
		price = p;
		weight = w;
	}

	public void displayFruits() {
		System.out.println("Fruit name is: " + name);
		System.out.println("Fruit price is: " + price);
		System.out.println("Fruit weight is: " + weight);
		System.out.println("===========================");
	}
}
