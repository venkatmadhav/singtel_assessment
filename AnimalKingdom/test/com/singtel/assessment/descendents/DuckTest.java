package com.singtel.assessment.descendents;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DuckTest {

private Duck duck;
	
	@Before
	public void setup() {
		duck = new Duck();
	}
	
	@Test
	public void testTalk() {
		final String sound = duck.talk();
		assertEquals("I say Quack, quack", sound);
	}

	@Test
	public void testSwim() {
		final String stroke = duck.swim();
		assertEquals("I am swimming", stroke);
	}
}
