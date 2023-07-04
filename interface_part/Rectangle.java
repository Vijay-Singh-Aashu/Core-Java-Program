package interface_part;

class Rectangle implements Shape {
	public void findArea() {
		double l = 12.5;
		double w = 15.6;
		System.out.println("The area is: " + (l * w));
	}

	public void findPerimeter() {
			double l = 18.5;
			double w = 12.5;
			System.out.println("The perimeter is: " + (2*(l+w)));
		}
}
