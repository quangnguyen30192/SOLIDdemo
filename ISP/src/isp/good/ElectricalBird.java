package isp.good;

public class ElectricalBird implements IFly, IRun {

	@Override
	public void fly() {
		System.out.println("Electrial Bird is flying");
	}

	@Override
	public void run() {
		System.out.println("Electrial Bird is running");
	}

}
