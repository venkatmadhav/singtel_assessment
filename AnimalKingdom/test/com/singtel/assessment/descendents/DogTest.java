package com.singtel.assessment.descendents;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DogTest {

private Dog dog;
	
	@Before
	public void setup() {
		dog = new Dog();
	}
	
	@Test
	public void testTalk() {
		final String sound = dog.talk();
		assertEquals("I say Woof,woof", sound);
	}

	@Test
	public void testWalk() {
		final String step = dog.walk();
		assertEquals("I am walking", step);
	}

	@Test
	public void testSwim() {
		final String stroke = dog.swim();
		assertEquals("I am swimming", stroke);
	}
}
