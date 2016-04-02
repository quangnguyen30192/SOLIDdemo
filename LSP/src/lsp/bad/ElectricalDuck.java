package lsp.bad;

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
		if(this.isPowerOn) {
			System.out.println("I am swimming");
		}
	}
}
