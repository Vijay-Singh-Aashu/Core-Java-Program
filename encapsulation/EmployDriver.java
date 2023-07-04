package encapsulation;

public class EmployDriver {
	public static void main(String[] args) {
		Employ e1 = new Employ();
		e1.setName("Mohan");
		System.out.println("Name is: " + e1.getName());
		e1.setEid(123);
		System.out.println("Eid is: " + e1.getEid());
		e1.setSalary(25000);
		System.out.println("Salary is: "+e1.getSalary());

	}
}
