package Constructor;

public class PenDriver {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.displayPen();
		Pen p2 = new Pen("Cello");
		p2.displayPen();
		Pen p3 = new Pen("Parker", "Blue");
		p3.displayPen();
		Pen p4 = new Pen("Nataraj", "Black", 20);
		p4.displayPen();

	}
}
