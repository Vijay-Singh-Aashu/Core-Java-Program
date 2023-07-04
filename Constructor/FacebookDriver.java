package Constructor;

public class FacebookDriver {
public static void main(String[] args) {
	Facebook f1 = new Facebook("Mark Zukerberg");
	f1.displayFacebook();
	Facebook f2 = new Facebook("Mark Zukerberg", 2004);
	f2.displayFacebook();
	Facebook f3 = new Facebook("Mark Zukerberg", 2004, 322.005);
	f3.displayFacebook();
}
}
