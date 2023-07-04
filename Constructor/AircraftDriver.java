package Constructor;

public class AircraftDriver {
	public static void main(String[] args) {
		Aircraft a1 = new Aircraft("Air India", 2000, 850.58);
		a1.displayAircraft();
		Aircraft a2 = new Aircraft("Reliance", 2300, 950.28);
		a2.displayAircraft();
		Aircraft a3 = new Aircraft("Indigo", 2100, 755.00);
		a3.displayAircraft();
	}
}
