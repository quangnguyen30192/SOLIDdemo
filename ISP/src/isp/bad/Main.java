package isp.bad;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Bird> birds = new LinkedList<Bird>();
		birds.add(new Eagle());
		birds.add(new Penguin());
		birds.add(new Pigeon());
		birds.add(new ElectricalBird());
		
		BirdKeeper birdKeeper = new BirdKeeper();
		birdKeeper.forceEat(birds);
		birdKeeper.forceRun(birds);
		birdKeeper.forceFly(birds);
	}
}
