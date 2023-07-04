package methodOverloading;

public class MainOverLoad {
	public static void main(String[] args) {
		System.out.println("String[] args parameter");
		main("Ram");
		main(23);
		main(10.80);
		main(23,78.56);
	}

	public static void main(String args) {
		System.out.println("String args parameter");
	}

	public static void main(int args) {
		System.out.println("int args parameter");
	}

	public static void main(double args) {
		System.out.println("double args parameter");
	}

	public static void main(int args, double y) {
		System.out.println("int, double parameter");

	}
}
