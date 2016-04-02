package isp.good;

import java.util.List;

public class BirdKeeper {
	
	public void forceEat(List<IEat> birds) {
		for (IEat bird : birds) {
			bird.eat();
		}
	}

	public void forceFly(List<IFly> birds) {
		for (IFly bird : birds) {
			bird.fly();
		}
	}

	public void forceRun(List<IRun> birds) {
		for (IRun bird : birds) {
			bird.run();
		}
	}
}