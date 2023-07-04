package abstraction;

public abstract class Vehicle {
	public abstract void start();

	public abstract void drive();

	public void accelerate() {
		System.out.println("Accelearte the vehicle");
	}

	public void playMusic() {
		System.out.println("play the music int the vehicle");
	}
}
