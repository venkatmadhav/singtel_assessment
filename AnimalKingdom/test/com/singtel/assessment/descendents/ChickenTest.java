package com.singtel.assessment.descendents;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ChickenTest {
	
	private Chicken chicken;
	
	@Before
	public void setup() {
		chicken = new Chicken(true);
	}

	@Test
	public void testTalk() {
		final String sound = chicken.talk();
		assertEquals("I say Cluck,cluck", sound);
	}

	@Test
	public void testFly() {
		final String fly = chicken.fly();
		assertEquals("I cannot fly", fly);
	}

}
