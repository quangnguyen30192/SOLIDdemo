package isp.good;

public class Eagle implements IFly, IRun, IEat {

	@Override
	public void fly() {
		System.out.println("Eagle is flying");
	}

	@Override
	public void run() {
		System.out.println("Eagle is running");
	}

	@Override
	public void eat() {
		System.out.println("Eagle is eating");
	}
}