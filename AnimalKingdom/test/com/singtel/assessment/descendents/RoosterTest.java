package com.singtel.assessment.descendents;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoosterTest {
	
	private Chicken chicken;
	
	@Before
	public void setup() {
		chicken = new Chicken(false);
	}

	@Test
	public void testTalk() {
		final String sound = chicken.talk();
		assertEquals("I say Cock-a-doddle-doo", sound);
	}

}
