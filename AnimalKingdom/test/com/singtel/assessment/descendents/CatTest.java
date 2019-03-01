package com.singtel.assessment.descendents;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CatTest {
	
	private Cat cat;
	
	@Before
	public void setup() {
		cat = new Cat();
	}
	

	@Test
	public void testTalk() {
		final String sound = cat.talk();
		assertEquals("I say Meow", sound);
	}

	@Test
	public void testWalk() {
		final String step = cat.walk();
		assertEquals("I am walking", step);
	}

	@Test
	public void testSwim() {
		final String stroke = cat.swim();
		assertEquals("I am swimming", stroke);
	}

}
