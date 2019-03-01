package com.singtel.assessment.descendents;

import com.singtel.assessment.animal.behavior.ITalk;
import com.singtel.assessment.animal.behavior.IWalk;
import com.singtel.assessment.parent.Bird;

public class Chicken extends Bird implements IWalk,ITalk {

	protected Boolean doesLayEggs;

	protected Rooster rooster;

	public Chicken(Boolean doesLayEggs) {
		this.doesLayEggs = doesLayEggs;
	}

	@Override
	public String talk() {
		if (!doesLayEggs) {
			rooster = new Rooster();
			return rooster.talk();
		} else {
			return "I say Cluck,cluck";
		}

	}

	@Override
	public String fly() {
		return "I cannot fly";
	}
}
