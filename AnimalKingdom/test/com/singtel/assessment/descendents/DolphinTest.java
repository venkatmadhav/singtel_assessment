package com.singtel.assessment.descendents;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DolphinTest {

private Dolphin dolphin;
	
	@Before
	public void setup() {
		dolphin = new Dolphin();
	}
	
	@Test
	public void testTalk() {
		final String sound = dolphin.talk();
		assertEquals("I cannot talk", sound);
	}

	@Test
	public void testWalk() {
		final String step = dolphin.walk();
		assertEquals("I cannot walk", step);
	}

	@Test
	public void testSwim() {
		final String stroke = dolphin.swim();
		assertEquals("I am good at swimming", stroke);
	}
}
