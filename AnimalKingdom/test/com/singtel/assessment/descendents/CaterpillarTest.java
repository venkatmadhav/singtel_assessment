package com.singtel.assessment.descendents;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CaterpillarTest {

	private Caterpillar caterpillar;
	
	@Before
	public void setup() {
		caterpillar = new Caterpillar();
	}

	@Test
	public void testWalk() {
		final String step = caterpillar.walk();
		assertEquals("I am walking", step);
	}

	@Test
	public void testFly() {
		final String fly = caterpillar.fly();
		assertEquals("I cannot fly", fly);
	}

}
