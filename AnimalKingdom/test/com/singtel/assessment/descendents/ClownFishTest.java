package com.singtel.assessment.descendents;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ClownFishTest {

private ClownFish clownfish;
	
	@Before
	public void setup() {
		clownfish = new ClownFish();
	}
	
	@Test
	public void testSize() {
		final String size = clownfish.size();
		assertEquals("I am small in size", size);
	}

	@Test
	public void testColor() {
		final String color = clownfish.color();
		assertEquals("I am orange in color", color);
	}

	@Test
	public void testCharacter() {
		final String character = clownfish.character();
		assertEquals("I crack jokes", character);
	}
}
