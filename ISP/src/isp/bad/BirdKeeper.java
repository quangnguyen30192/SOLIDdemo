package isp.bad;

import java.util.List;

public class BirdKeeper {
	public void forceEat(List<Bird> birds) {
		for (Bird bird : birds) {
			bird.eat();
		}
	}

	public void forceFly(List<Bird> birds) {
		for (Bird bird : birds) {
			bird.fly();
		}
	}

	public void forceRun(List<Bird> birds) {
		for (Bird bird : birds) {
			bird.run();
		}
	}
}