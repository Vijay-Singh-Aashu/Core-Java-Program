package return_statement;

public class Program12 {
	public static int findBig(int a, int b) {
		int c = a > b ? a : b;
		return c;
	}
	public static void main(String[] args) {
		System.out.println("The biggest is: "+findBig(60,80));
		System.out.println("The biggest is: "+findBig(findBig(60,80),90));
	}
}
