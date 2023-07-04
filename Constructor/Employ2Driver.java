package Constructor;

public class Employ2Driver {
	public static void main(String[] args) {

		Employ2 e1 = new Employ2();
		e1.displayEmploy2();
		Employ2 e2 = new Employ2("Ram");
		e2.displayEmploy2();
		Employ2 e3 = new Employ2("Mohan", 1021);
		e3.displayEmploy2();
		Employ2 e4 = new Employ2("Sohan", 2018, 17456.98);
		e4.displayEmploy2();
		Employ2 e5 = new Employ2("Mohini", 2218, 16556.98, "Noida");
		e5.displayEmploy2();
	}
}