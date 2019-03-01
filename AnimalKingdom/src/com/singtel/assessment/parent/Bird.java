package com.singtel.assessment.parent;

public class Bird extends Animal {

	public String fly() {
		return "I am flying";
	}

	public String sing() {
		return "I am singing";
	}

	@Override
	public String talk() {
		return "I am talking";
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
