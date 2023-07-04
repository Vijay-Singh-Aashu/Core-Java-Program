package Constructor;

public class Aircraft {
	String name;
	int fly;
	double speed;

	Aircraft(String name, int fly, double speed) {
		this.name = name;
		this.fly = fly;
		this.speed = speed;
	}

	public void displayAircraft() {
		System.out.println("Aircraft name is: " + name);
		System.out.println("Aircraft fly(height in ft) is: " + fly);
		System.out.println("Aircraft speed(km/h) is: " + speed);
	}
}
