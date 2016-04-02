package lsp.good;

public class ElectricalDuck implements Duck {
	
	private boolean isPowerOn;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void turnPowerOn() {
		isPowerOn = true;
	}

	@Override
	public void swim() {
		if(!this.isPowerOn) {
			turnPowerOn();
		}
		System.out.println("I am swimming");
	}
}
