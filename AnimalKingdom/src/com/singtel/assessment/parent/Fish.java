package com.singtel.assessment.parent;

import com.singtel.assessment.animal.behavior.ISwim;

public class Fish extends Animal implements ISwim {

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
		return "I am swimming";
	}

	public String size() {
		return "";
	}

	public String color() {
		return "";
	}

	public String character() {
		return "";
	}

}
