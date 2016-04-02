package isp.bad;

public class Pigeon implements Bird {
	@Override
	public void fly() {
		System.out.println("Pigeon is flying");
	}

	@Override
	public void run() {
		System.out.println("Pigeon is running");
	}

	@Override
	public void eat() {
		System.out.println("Pigeon is eating");
	}
}