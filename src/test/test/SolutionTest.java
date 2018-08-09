package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import test.Bird;
import test.Butterfly;
import test.Caterpillar;
import test.Chicken;
import test.Clownfish;
import test.Dolphin;
import test.Duck;
import test.InternationalRooster;
import test.Parrot;
import test.Rooster;
import test.Shark;
import test.Solution;

public class SolutionTest {

	@org.junit.Test
	public void testBirdSing() {
		Bird bird = new Bird();
		bird.sing();
		assertEquals(bird.word, "I am a bird");
	}
	
	@org.junit.Test
	public void testDuck() {
		Duck duck = new Duck();
		duck.sing();
		assertEquals(duck.word, "Quack, quack");
		duck.swim();
		assertTrue(duck.canswim);
	}
	
	@org.junit.Test
	public void testChicken() {
		Chicken chicken = new Chicken();
		chicken.sing();
		assertEquals(chicken.word, "Cluck, cluck");
		chicken.fly();
		assertFalse(chicken.canfly);
	}
	
	@org.junit.Test
	public void testRooster() {
		Rooster rooster = new Rooster();
		rooster.sing();
		assertEquals(rooster.word, "Cock-a-doodle-doo");
		rooster.fly();
		assertFalse(rooster.canfly);
	}
	
	@org.junit.Test
	public void testParrot() {
		Parrot parrotlivingwithdogs = new Parrot("Woof, woof");
		parrotlivingwithdogs.sing();
		assertEquals(parrotlivingwithdogs.word, "Woof, woof");
		Parrot parrotlivingwithcats = new Parrot("Meow");
		parrotlivingwithcats.sing();
		assertEquals(parrotlivingwithcats.word, "Meow");
		Parrot parrotlivingwithroosters = new Parrot("Cock-a-doodle-doo");
		parrotlivingwithroosters.sing();
		assertEquals(parrotlivingwithroosters.word, "Cock-a-doodle-doo");
	}
	
	@org.junit.Test
	public void testShark() {
		Shark shark = new Shark();
		shark.show();
		assertEquals(shark.isLargeAndGrey, true);
		assertEquals(shark.canEatOtherFish, true);
		shark.swim();
		assertTrue(shark.canswim);
	}
	
	@org.junit.Test
	public void testClownfish() {
		Clownfish fish = new Clownfish();
		fish.show();
		assertEquals(fish.canMakeJoke, true);
		assertEquals(fish.isSmallAndColourful, true);
		fish.swim();
		assertTrue(fish.canswim);
	}
	
	@org.junit.Test
	public void testDolphin() {
		Dolphin dolphin = new Dolphin();
		dolphin.walk();
		assertFalse(dolphin.canwalk);
		dolphin.swim();
		assertTrue(dolphin.fish.canswim);
	}
	
	@org.junit.Test
	public void testCaterpillar() {
		Caterpillar test = new Caterpillar();
		test.fly();
		assertEquals(test.canfly, false);
	}
	
	@org.junit.Test
	public void testButterfly() {
		Butterfly test = new Butterfly();
		test.fly();
		assertEquals(test.canfly, true);
	}
	
	@org.junit.Test
	public void testCountAnimal() {
		Solution solution = new Solution();
		solution.countAnimals();
		assertEquals(solution.walkAnimal.size(), 9);
		assertEquals(solution.flyAnimal.size(), 4);
		assertEquals(solution.singAnimal.size(), 5);
		assertEquals(solution.swimAnimal.size(), 4);
	}

}
