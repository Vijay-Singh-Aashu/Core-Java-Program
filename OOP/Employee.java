package OOP;

class Employee {
	static String compName = "XYZ";
	String empName;
	int empId;

	public static void punch() {
		System.out.println("Employ should punch the biometric");
	}

	public void work() {
		System.out.println("Employ is working");
	}

	public static void main(String[] args) {
		System.out.println(compName);
		punch();
		Employee e1 = new Employee();
		System.out.println(e1.empName);
		System.out.println(e1.empId);
		e1.work();

	}

}
