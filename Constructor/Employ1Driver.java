package Constructor;

public class Employ1Driver {
	public static void main(String[] args) {
		Employ1 e1 = new Employ1();
		e1.displayEmploy1();
		Employ1 e2 = new Employ1("Ram");
		e2.displayEmploy1();
		Employ1 e3 = new Employ1("Mohan", 1021);
		e3.displayEmploy1();
		Employ1 e4 = new Employ1("Sohan", 2018, 17456.98);
		e4.displayEmploy1();
		Employ1 e5 = new Employ1(2055, 19786.98);
		e5.displayEmploy1();
		Employ1 e6 = new Employ1("Mohini", 2218, 16556.98, "Noida");
		e6.displayEmploy1();

	}

}
