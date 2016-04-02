package lsp.bad;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Duck> ducks = new LinkedList<Duck>();
		ducks.add(new RegularDuck());
		ducks.add(new RegularDuck());
		ducks.add(new RegularDuck());
		ducks.add(new ElectricalDuck());
		
		DuckKeeper duckKeeper = new DuckKeeper();
		duckKeeper.forceSwim(ducks);
	}
}
