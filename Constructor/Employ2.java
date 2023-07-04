package Constructor;

public class Employ2 {
	String name;
	int empid;
	double salary;
	String address;

	Employ2() {
		System.out.println("Employ object is created");
	}

	Employ2(String name) {
		this();
		this.name = name;
	}

	Employ2(String name, int empid) {
		this(name);
		this.empid = empid;
	}

	Employ2(String name, int empid, double salary) {
		this(name, empid);
		this.salary = salary;
	}

	Employ2(String name, int empid, double salary, String address) {
		this(name, empid, salary);
		this.address = address;
	}

	public void displayEmploy2() {
		System.out.println("name is: " + name);
		System.out.println("empid is: " + empid);
		System.out.println("salary is: " + salary);
		System.out.println("address is: " + address);
		System.out.println("===========================");
	}
}
