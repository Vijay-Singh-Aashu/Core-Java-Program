package encapsulation;

import java.util.Scanner;

public class Laptop {
	private int pwd = 2211;
	private String name;
	private int price;
	private double storage;

	public String getName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password: ");
		int a = sc.nextInt();
		if (pwd == a) {
			System.out.println("Password verification is successful");
			return name;
		} else {
			System.out.println("Password is invalid");
			return null;
		}
	}

	public int getPrice() {
		// validation
		return price;
	}

	public double getStorage() {
		// validation
		return storage;
	}

	public void setName(String name) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password: ");
		int a = sc.nextInt();
		if (pwd == a) {
			System.out.println("Password verification is successful and Name is set");
			this.name = name;
		} else {
			System.out.println("Password is invalid and name is not set");
		}
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setStroage(double storage) {
		this.storage = storage;
	}
}
