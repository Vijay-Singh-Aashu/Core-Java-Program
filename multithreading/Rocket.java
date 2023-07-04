package multithreading;

public class Rocket implements Runnable {

	public void run() {
		System.out.println("===============================");
		System.out.println("RUn method is implemented");
		System.out.println("Thrtead name is: " + Thread.currentThread().getName());
		System.out.println("Thread priority is: " + Thread.currentThread().getPriority());
		System.out.println("Current thread is terminated");

	}

}
