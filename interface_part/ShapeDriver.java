package interface_part;

class ShapeDriver {
	public static void main(String[] args) {

		Shape s1 = new Rectangle();
		s1.findArea();
		s1.findPerimeter();

		Shape s2 = new Circle();
		s2.findArea();
		s2.findPerimeter();
	}
}
