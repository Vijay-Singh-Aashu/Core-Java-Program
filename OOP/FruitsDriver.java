package OOP;

class FruitsDriver {
	public static void main(String[] args) {
		System.out.println("====================1st Fruit details====================");
		Fruits f1 = new Fruits();
		f1.setValue("Mango", 120, 3.6);
		f1.displayFruits();
		System.out.println("====================2nd Fruit details====================");
		Fruits f2 = new Fruits();
		f2.setValue("Orange", 80, 3.8);
		f2.displayFruits();
		System.out.println("====================3rd Fruit details====================");
		Fruits f3 = new Fruits();
		f3.setValue("Papaya", 60, 5.6);
		f3.displayFruits();
	}

}
