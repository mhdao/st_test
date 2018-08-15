package test;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
	protected boolean canwalk = true;
	void walk() {
		if (canwalk) {
			System.out.println("I am walking");
		} else {
			System.out.println("I cannot walk");
		}
	}
}

class Bird extends Animal {
	protected String word = "I am a bird";
	protected boolean canfly = true;
	void fly() {
		if (canfly) {
			System.out.println("I am flying");
		} else {
			System.out.println("I cannot fly");
		}
	}
	void sing() {
		System.out.println(word);
	}
}

class Duck extends Bird {
	protected boolean canswim = true;
	public Duck() {
		word = "Quack, quack";
	}

	void swim() {
		if (canswim) {
			System.out.println("I am swimming");
		}
	}
}

class Chicken extends Bird {
	public Chicken() {
		word = "Cluck, cluck";
		canfly = false;
	}
}

class Rooster extends Chicken {
	public Rooster() {
		word = "Cock-a-doodle-doo";
		canfly = false;
	}
}

class Parrot extends Bird {
	public Parrot() {
	}
	public Parrot(String word) {
		this.word = word;
	}
}

class Fish extends Animal {
	protected boolean canswim = true;
	public Fish() {
		canwalk = false;
	}
	
	void swim() {
		if (canswim) {
			System.out.println("I am swimming");
		}
	}
}

class Shark extends Fish {
	protected boolean isLargeAndGrey = true;
	protected boolean canEatOtherFish = true;
	void show() {
		if (isLargeAndGrey) {
			System.out.println("I am large and grey");
		}
		if (canEatOtherFish) {
			System.out.println("I eat other fish");
		}
	}
}

class Clownfish extends Fish {
	protected boolean isSmallAndColourful = true;
	protected boolean canMakeJoke = true;
	void show() {
		if (isSmallAndColourful) {
			System.out.println("I am small and colourful");
		}
		if (canMakeJoke) {
			System.out.println("I make jokes");
		}
	}
}

class Dolphin extends Animal{
	protected Fish fish = new Fish();
	public Dolphin() {
		canwalk = false;
	}
	void swim() {
		fish.swim();
	}
}

class Caterpillar extends Animal {
	protected boolean canfly = false;
	void fly() {
		if (canfly) {
			System.out.println("I am flying");
		} else {
			System.out.println("I cannot fly");
		}
	}
}

class Butterfly extends Caterpillar {
	public Butterfly() {
		canfly = true;
	}
}

class Frog extends Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Solution solution = new Solution();
		solution.countAnimals();
	}
	List<Animal> flyAnimal = new ArrayList<>();
	List<Animal> walkAnimal = new ArrayList<>();
	List<Animal> singAnimal = new ArrayList<>();
	List<Animal> swimAnimal = new ArrayList<>();
	
	public void countAnimals() {
		Animal[] animals = new Animal[]{
				 new Bird(),
				 new Duck(),
				 new Chicken(),
				 new Rooster(),
				 new Parrot(),
				 new Fish(),
				 new Shark(),
				 new Clownfish(),
				 new Dolphin(),
				 new Frog(),
				 new Dog(),
				 new Butterfly(),
				 new Cat()
				};

		for (Animal animal : animals) {
			if (animal instanceof Animal  && !(animal instanceof Fish) && !(animal instanceof Dolphin)) {
				walkAnimal.add(animal);
			}
			if ((animal instanceof Bird && !(animal instanceof Chicken)) ||	animal instanceof Butterfly) {
				flyAnimal.add(animal);
			}
			if (animal instanceof Bird) {
				singAnimal.add(animal);
			}
			if (animal instanceof Dolphin || animal instanceof Fish) {
				swimAnimal.add(animal);
			}
		}

	}
}

