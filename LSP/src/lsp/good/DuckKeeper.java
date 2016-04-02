package lsp.good;

import java.util.List;


public class DuckKeeper {
	
	public void forceSwim(List<Duck> ducks) {
		for (Duck duck : ducks) {
			duck.swim();
		}
	}
}
