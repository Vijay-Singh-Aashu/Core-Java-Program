package abstraction;

public abstract class Car extends Vehicle {

	public abstract void stop();

	public void openGate() {
		System.out.println("Open the gate of car");
	}

}
