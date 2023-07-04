package inheritance;

public class Carrot extends Vegetable {
	int c = 30;
	int x = 60;

	public void demo() {
		int d = 50;
		int x = 80;
		System.out.println("Local d of demo is: " + d);
		System.out.println("Global of Carrot is: " + c);
		System.out.println("Global a of  Vegetable is: " + a);
		System.out.println(a + c + d);
		System.out.println("Local x is: "+x);
		System.out.println("Global x of Carrot: "+this.x);
		System.out.println("Global x of Vegetable is: "+super.x);
		System.out.println("================");
		test();
	}
}
