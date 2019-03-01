package com.singtel.assessment.descendents;

import com.singtel.assessment.animal.behavior.IFly;
import com.singtel.assessment.animal.behavior.ITalk;
import com.singtel.assessment.parent.Animal;
import com.singtel.assessment.parent.Bird;

public class Parrot extends Bird implements ITalk, IFly {

	protected Animal neighbour;

	public Parrot(Animal neighbour) {
		this.neighbour = neighbour;
	}

	@Override
	public String talk() {

		if (hasNeighbour()) {
			return neighbour.talk();
		} else {
			return talk();
		}
	}

	private boolean hasNeighbour() {
		return neighbour != null;
	}

}
