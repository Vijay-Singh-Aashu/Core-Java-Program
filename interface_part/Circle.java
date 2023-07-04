package interface_part;

class Circle implements Shape {
	public void findArea() {
		double r = 12.5;
		System.out.println("The area is: " + (3.14 * r * r));
	}

	public void findPerimeter() {
		double r = 18.5;
		System.out.println("The perimeter is: " + (3.14 * 2 * r));
	}

}
