package com.singtel.assessment.parent;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BirdTest {

	private Bird bird;

	@Before
	public void setup() {
		bird = new Bird();
	}

	@Test
	public void testTalk() {
		final String sound = bird.talk();
		assertEquals("I am talking", sound);
	}

	@Test
	public void testFly() {
		final String fly = bird.fly();
		assertEquals("I am flying", fly);
	}

	@Test
	public void testSing() {
		final String fly = bird.sing();
		assertEquals("I am singing", fly);
	}

	@Test
	public void testWalk() {
		final String fly = bird.walk();
		assertEquals("I am walking", fly);
	}

	@Test
	public void testSwim() {
		final String fly = bird.swim();
		assertEquals("I am swimming", fly);
	}
}
