package Constructor;

public class Employ1 {
	String name;
	int empid;
	double salary;
	String address;

	Employ1() {

	}

	Employ1(String name) {
		this.name = name;
	}

	Employ1(String name, int empid) {
		this.name = name;
		this.empid = empid;
	}

	Employ1(String name, int empid, double salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}

	Employ1(int empid, double salary) {
		this.empid = empid;
		this.salary = salary;
	}

	Employ1(String name, int empid, double salary, String address) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.address = address;
	}

	public void displayEmploy1() {
		System.out.println("name is: " + name);
		System.out.println("empid is: " + empid);
		System.out.println("salary is: " + salary);
		System.out.println("address is: " + address);
		System.out.println("===========================");
	}
}
