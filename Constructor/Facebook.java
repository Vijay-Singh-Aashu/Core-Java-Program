package Constructor;

public class Facebook {
	String owner_name;
	int publish_year;
	double latest_version;

	Facebook(String owner_name) {
		this.owner_name = owner_name;
	}

	Facebook(String owner_name, int publish_year) {
		this(owner_name);
		this.publish_year = publish_year;
	}

	Facebook(String owner_name, int publish_year, double latest_version) {
		this(owner_name, publish_year);
		this.latest_version = latest_version;
	}

	public void displayFacebook() {
		System.out.println("Facebook owner's name is: " + owner_name);
		System.out.println("Facebook published in: " + publish_year);
		System.out.println("Facebook latest version is: " + latest_version);
		System.out.println("=============================================");
	}
}
