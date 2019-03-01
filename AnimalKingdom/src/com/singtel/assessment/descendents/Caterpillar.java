package com.singtel.assessment.descendents;

import com.singtel.assessment.animal.behavior.IWalk;
import com.singtel.assessment.parent.Bird;

public class Caterpillar extends Bird implements IWalk{
	
	@Override
	public String fly() {
		return "I cannot fly";
	}

	@Override
	public String walk() {
		return "I am walking";
	}

}
