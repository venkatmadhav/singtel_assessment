package com.singtel.assessment.descendents;

import com.singtel.assessment.animal.behavior.ISwim;
import com.singtel.assessment.animal.behavior.ITalk;
import com.singtel.assessment.animal.behavior.IWalk;
import com.singtel.assessment.parent.Animal;

public class Cat extends Animal implements ITalk, IWalk, ISwim {

	@Override
	public String talk() {
		return "I say Meow";
	}

	@Override
	public String walk() {
		return "I am walking";

	}

	@Override
	public String swim() {
		return "I am swimming";
	}

}
