package com.singtel.assessment.descendents;

import com.singtel.assessment.animal.behavior.ISwim;
import com.singtel.assessment.parent.Animal;

public class Dolphin extends Animal implements ISwim {

	@Override
	public String talk() {
		return "I cannot talk";

	}

	@Override
	public String walk() {
		return "I cannot walk";
	}

	@Override
	public String swim() {
		return "I am good at swimming";
	}

}
