package com.singtel.assessment.descendents;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ButterflyTest {

	private Butterfly butterfly;
	
	
	@Before
	public void setup() {
		butterfly = new Butterfly();
	}

	@Test
	public void testTalk() {
		final String sound = butterfly.talk();
		assertEquals("I cannot make sound", sound);
	}

	@Test
	public void testFly() {
		final String fly = butterfly.fly();
		assertEquals("I am flying", fly);
	}

}
