package encapsulation;

import java.util.Scanner;

public class Employ {
	private int pwd = 12345;
	private String name;
	private int eid;
	private double salary;

	public String getName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password: ");
		int x = sc.nextInt();
		if (pwd == x) {
			System.out.println("Password verification is successful");
			return name;
		} else {
			System.out.println("Password is invalid");
			return null;
		}
	}

	public int getEid() {
		// validation
		return eid;
	}

	public double getSalary() {
		// validation
		return salary;
	}

	public void setName(String name) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password: ");
		int x = sc.nextInt();
		if (pwd == x) {
			System.out.println("Password verification is successful and Name is set");
			this.name = name;
		} else {
			System.out.println("Password is invalid and Name is not set");
		}
	}

	public void setEid(int eid) {
		// validation
		this.eid = eid;
	}

	public void setSalary(double salary) {
		// validation
		this.salary = salary;
	}
}
