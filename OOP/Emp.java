package OOP;

class Emp {
	static String comp_Name = "TCS";
	String empName;
	int age;

	static void punch() {
		System.out.println("Punch your Details");
	}

	void work() {
		System.out.println("Employ is working");
	}

	public static void main(String[] args) {
		System.out.println("Main method Starts");
		System.out.println(comp_Name);
		punch();

	}
}
