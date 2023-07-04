package object_class;

public class Employ {
	String name;
	int eid;
	double salary;

	Employ() {

	}

	Employ(String name, int eid, double salary) {
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}

	public String toString() {

		return "Name is: " + name + " Emp id is: " + eid + " Salary is: " + salary + "";

	}

	public int hashCode() {
		return eid;
	}

	public boolean equals(Object o) {
		
		Employ e = (Employ) o;
		return this.name.equals(e.name) && this.eid == e.eid && this.salary == e.salary;
		
	}
}
