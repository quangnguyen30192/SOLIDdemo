package isp.good;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		Penguin penguin = new Penguin();
		Pigeon pigeon = new Pigeon();
		ElectricalBird electricalBird = new ElectricalBird();
		
		List<IFly> iFlyBirds = new LinkedList<IFly>();
		iFlyBirds.add(eagle);
		iFlyBirds.add(pigeon);
		iFlyBirds.add(electricalBird);

		List<IEat> iEatBirds = new LinkedList<IEat>();
		iEatBirds.add(eagle);
		iEatBirds.add(pigeon);
		iEatBirds.add(penguin);
		
		List<IRun> IRunBirds = new LinkedList<IRun>();
		IRunBirds.add(eagle);
		IRunBirds.add(pigeon);
		IRunBirds.add(electricalBird);
		IRunBirds.add(penguin);
		
		BirdKeeper birdKeeper = new BirdKeeper();
		birdKeeper.forceEat(iEatBirds);
		birdKeeper.forceRun(IRunBirds);
		birdKeeper.forceFly(iFlyBirds);
	}
}
