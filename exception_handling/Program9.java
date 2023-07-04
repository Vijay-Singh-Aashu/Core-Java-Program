package exception_handling;

public class Program9 {

	public static void main(String[] args) {
		try {
			checkEligiblity(15);
		} catch (Exception e) {
			System.out.println("You are underAge");
			System.out.println(e);
			System.out.println("==============");

			e.printStackTrace();
		}
	}

	public static void checkEligiblity(int age) throws UnderAgeException {
		if (age >= 18) {
			System.out.println("You ar eeligible to vote");
		} else {
			throw new UnderAgeException();
		}
	}

}
