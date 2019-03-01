package com.singtel.assessment.descendents;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.singtel.assessment.parent.Animal;

public class ParrotTest {
	
	private Parrot parrot;
	
	private Animal animal;

	@Before
	public void setup() {
		animal = new Dog();
		parrot = new Parrot(animal);
	}
	
	@Test
	public void testTalk() {
		final String sound = parrot.talk();
		assertEquals("I say Woof,woof", sound);
	}

}
