package isp.bad;

public class Penguin implements Bird {

	@Override
	public void fly() {
		throw new UnsupportedOperationException("Penguin can't fly");
	}

	@Override
	public void run() {
		System.out.println("Penguin is running");
	}

	@Override
	public void eat() {
		System.out.println("Penguin is eating");
	}
}
