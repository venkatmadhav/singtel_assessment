package com.singtel.assessment.descendents;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SharkTest {

private Shark shark;
	
	@Before
	public void setup() {
		shark = new Shark();
	}
	
	@Test
	public void testSize() {
		final String size = shark.size();
		assertEquals("I am large in size", size);
	}

	@Test
	public void testColor() {
		final String color = shark.color();
		assertEquals("I am grey in color", color);
	}

	@Test
	public void testCharacter() {
		final String character = shark.character();
		assertEquals("I eat other fish", character);
	}
}
