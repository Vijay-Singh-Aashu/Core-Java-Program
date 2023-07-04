package Constructor;

public class SmartPhone_Driver {
	public static void main(String[] args) {
		Smart_Phone s1 = new Smart_Phone("Lenovo");
		s1.displaySmart_Phone();
		Smart_Phone s2 = new Smart_Phone("Samsung", 64);
		s2.displaySmart_Phone();
		Smart_Phone s3 = new Smart_Phone("Oneplus", 256, 28748.00);
		s3.displaySmart_Phone();
	}
}
