package Constructor;

public class CompanyDriver {
	public static void main(String[] args) {
		Company c1 = new Company("Infosys", 12800, 0.7);
		c1.displayCompany();
		Company c2 = new Company("Wipro", 12900, 0.8);
		c2.displayCompany();
		Company c3 = new Company("Tcs", 13000, 0.9);
		c3.displayCompany();

	}
}
