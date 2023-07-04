package Constructor;

public class Company {
	String name;
	int employees;
	double area;

	Company(String name, int employees, double area) {
		this.name = name;
		this.employees = employees;
		this.area = area;
	}

	public void displayCompany() {
		System.out.println("Company name is: " + name);
		System.out.println("Company employees are: " + employees);
		System.out.println("Company area(square kilometer) is: " + area);
		System.out.println("===========================");
	}
}