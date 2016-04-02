package isp.bad;

public class ElectricalBird implements Bird {

	@Override
	public void fly() {
		System.out.println("Electrial Bird is flying");
	}

	@Override
	public void run() {
		System.out.println("Electrial Bird is running");
	}

	@Override
	public void eat() {
		throw new UnsupportedOperationException("Electrial Bird doesn't need to eat");
	}
}
