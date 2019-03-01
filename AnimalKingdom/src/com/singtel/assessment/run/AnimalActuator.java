package com.singtel.assessment.run;

import com.singtel.assessment.animal.behavior.IFly;
import com.singtel.assessment.animal.behavior.ISwim;
import com.singtel.assessment.animal.behavior.ITalk;
import com.singtel.assessment.animal.behavior.IWalk;
import com.singtel.assessment.descendents.Chicken;
import com.singtel.assessment.descendents.ClownFish;
import com.singtel.assessment.descendents.Dog;
import com.singtel.assessment.descendents.Dolphin;
import com.singtel.assessment.descendents.Duck;
import com.singtel.assessment.descendents.Parrot;
import com.singtel.assessment.descendents.Shark;
import com.singtel.assessment.parent.Animal;
import com.singtel.assessment.parent.Fish;

public class AnimalActuator {

	
	/*
	 * 
	 * @param args
	 * This method is used to calculate count of animals having various skills
	 * Allowed values are fly, walk, swim, talk
	 */
	public static void main(String args[]) {
		Animal[] animals = new Animal[] {new Duck(), new Chicken(true), new Chicken(false), new Fish(),
				new Parrot(new Dog()), new Shark(), new ClownFish(), new Dolphin() };

		int canWalk = 0, canTalk = 0, canSwim = 0, canFly = 0;
		for (Animal eachAnimal : animals) {
			if (eachAnimal instanceof IFly) {
				canFly++;
			}
			if (eachAnimal instanceof ISwim) {
				canSwim++;
			}
			if (eachAnimal instanceof ITalk) {
				canTalk++;
			}
			if (eachAnimal instanceof IWalk) {
				canWalk++;
			}
		}

		switch (args[0]) {
		case "fly":
			System.out.println("Count of animals which fly :: " + canFly);
			break;
		case "walk":
			System.out.println("Count of animals which walk :: " + canWalk);
			break;
		case "swim":
			System.out.println("Count of animals which swim :: " + canSwim);
			break;
		case "talk":
			System.out.println("Count of animals which talk :: " + canTalk);
			break;
		default:
			System.out.println("Unidentified input string");
		}
	}

}
