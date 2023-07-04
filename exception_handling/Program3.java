package exception_handling;

public class Program3 {

	public static void main(String[] args) {
		System.out.println("Main starts");

		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("Exception caught");
		} finally {
			System.out.println("this is finally block");
		}
		System.out.println("program ends");
	}

}
