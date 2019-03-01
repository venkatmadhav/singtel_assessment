package com.singtel.assessment.descendents;

import com.singtel.assessment.animal.behavior.ISwim;
import com.singtel.assessment.animal.behavior.ITalk;
import com.singtel.assessment.parent.Bird;

public class Duck extends Bird implements ISwim, ITalk {

	@Override
	public String talk() {
		return "I say Quack, quack";

	}

	@Override
	public String swim() {
		return "I am swimming";

	}
}
