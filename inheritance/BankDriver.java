package inheritance;

public class BankDriver {
	public static void main(String[] args) {
		Bank b1 = new Bank("HDFC", "HDFC011234");
		System.out.println(b1.bName);
		System.out.println(b1.ifsc);
		System.out.println("====================");
		SavingsAccount s1 = new SavingsAccount("ICICI", "ICICI006783", "Mohan", 23582566, 457893.57);
		System.out.println(s1.bName);
		System.out.println(s1.ifsc);
		System.out.println(s1.cusName);
		System.out.println(s1.accNumber);
		System.out.println(s1.balance);
	}
}
