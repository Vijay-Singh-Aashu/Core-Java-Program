package OOP;

class Vegetable {
	String name;
	int price;
	double weight;

	Vegetable(String n, int p, double w) {
		name = n;
		price = p;
		weight = w;
	}

	void displayVegetable() {
		System.out.println("Vegetable name is: " + name);
		System.out.println("Vegetable price is: " + price);
		System.out.println("vegetable weight is: " + weight);
		System.out.println("===========================");
	}
}
