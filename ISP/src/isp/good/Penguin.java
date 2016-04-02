package isp.good;

public class Penguin implements IRun, IEat {

	@Override
	public void run() {
		System.out.println("Penguin is running");
	}

	@Override
	public void eat() {
		System.out.println("Penguin is eating");
	}
}
