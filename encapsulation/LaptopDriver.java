package encapsulation;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.setName("Lenovo");
		System.out.println("Name is: " + l1.getName());
		l1.setPrice(45000);
		System.out.println("Price is: "+l1.getPrice());
		l1.setStroage(8);
		System.out.println("Storage is: "+l1.getStorage());
	}
}
