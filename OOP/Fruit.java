package OOP;

class Fruit {
	String name;
	int price;
	double weight;

	public void eat() {
		System.out.println("Eat the Fruit");
	}

	public static void main(String[] args) {
		System.out.println("====================1st Fruit details====================");
		Fruit f1 = new Fruit();
		System.out.println(f1);
		System.out.println("Fruit name is: " + f1.name);
		System.out.println("Fruit price is: " + f1.price);
		System.out.println("Fruit weight is: " + f1.weight);
		f1.eat();
		System.out.println("====================2nd Fruit details====================");
		Fruit f2 = new Fruit();
		System.out.println(f2);
		System.out.println("Fruit name is: " + f2.name);
		System.out.println("Fruit price is: " + f2.price);
		System.out.println("Fruit weight is: " + f2.weight);
		f2.eat();

	}

}
