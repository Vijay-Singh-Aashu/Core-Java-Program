package Constructor;

public class Employ {
	String name;
	int empid;
	double salary;

	Employ(String name, int empid, double salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}

	public void displayEmploy() {
		System.out.println("name is: " + name);
		System.out.println("empid is: " + empid);
		System.out.println("salary is: " + salary);
		System.out.println("===========================");
	}

}
