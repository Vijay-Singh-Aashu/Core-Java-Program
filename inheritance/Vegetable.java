package inheritance;

public class Vegetable {

	int a = 12;
	int x = 40;
	 public void test() {
		 int b = 20;
		 int x = 50;
		 System.out.println("Local b is: "+b);
		 System.out.println("Global a is: "+a);
		 System.out.println("Local x is: "+x);
		 System.out.println("Global x is: "+this.x);
	 }
}
