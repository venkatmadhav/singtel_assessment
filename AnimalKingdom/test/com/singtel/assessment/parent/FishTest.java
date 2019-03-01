package com.singtel.assessment.parent;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FishTest {

	private Fish fish;

	@Before
	public void setup() {
		fish = new Fish();
	}

	@Test
	public void testTalk() {
		final String sound = fish.talk();
		assertEquals("I cannot talk", sound);
	}

	@Test
	public void testWalk() {
		final String fly = fish.walk();
		assertEquals("I cannot walk", fly);
	}

	@Test
	public void testSwim() {
		final String fly = fish.swim();
		assertEquals("I am swimming", fly);
	}
}
