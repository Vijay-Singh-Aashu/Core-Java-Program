package inheritance;

public class SavingsAccount extends Bank {
	String cusName;
	int accNumber;
	double balance;

	SavingsAccount() {

	}

	SavingsAccount(String bName, String ifsc, String cusName, int accNumber, double balance) {
		super(bName, ifsc);
		this.cusName = cusName;
		this.accNumber = accNumber;
		this.balance = balance;

	}
}
