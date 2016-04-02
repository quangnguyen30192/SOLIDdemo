package isp.good;

public class Pigeon implements IFly, IRun, IEat {
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