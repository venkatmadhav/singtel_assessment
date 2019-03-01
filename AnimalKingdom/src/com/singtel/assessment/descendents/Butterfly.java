package com.singtel.assessment.descendents;

import com.singtel.assessment.animal.behavior.IFly;

public class Butterfly extends Caterpillar implements IFly {

	@Override
	public String fly() {
		return "I am flying";
	}
	
	@Override
	public String talk() {
		return "I cannot make sound";

	}
}
