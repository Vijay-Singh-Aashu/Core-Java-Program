package Static_keyword;

public class Program1 {
	static int a = 34;

	public static void main(String[] args) {
		System.out.println(a); // global
		a = 56; // global
		System.out.println(a); // global
		int a = 60; // local
		System.out.println(a); // local
		a = 80; // local
		System.out.println(a); // local
		System.out.println(Program1.a); // global
		Program1.a = 590; // global
		System.out.println(a); // local
		System.out.println(Program1.a); // global
	}
}
