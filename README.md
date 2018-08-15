# st_test
**Over View**
This is test exam, demostration the inheritance of methods and properties from Animal class to chidren class. Eclipse is used to devloper this test

## Source Code Structure

Below is source code structure of application:
+ st_test
	+ src/main
			+ InternationalRooster.java
			+ Solution.java
	+ src/test
			+ InternationalRoosterTest.java
			+ SolutionTest.java
	+ lib    
		+ junit-4.0.jar
	+ README.md
  
  ## Source Code Detail

Source code stored in **src/main** folder includes 2 classes
1. **Solution.java** is class that contain all classes.
  - Animal is parent of all classes, it is abstract class, **boolean canwalk** is default value true, mean the detaul all animal can walk. **void walk** method will say 'I am walking' if animal can walk and say 'I cannot walk' in opposite case
  - Bird is derivered from Animal, it is inherited canwalk from parent and also has new properites: **String word** supports bird to sing a word. **boolean canfly** can tell a bird can fly or not.
  - Duck inherit sing method from Bird, it can sing "Quack, quack" which is initial in contructor. Duck also can swim, 'void swim' method say that duck is swimming
  - Chicken is child class of Bird, but it cannot fly, canfly property is set to false in contructor.
  - Rooster is child class of Chicken. it almost the same Chicken class, just different in the word to sing
  - Parrot is child class of Bird
  - Fish is extended from Animal but it has new property: canswim
  - Shark, Clownfish are extended from Fish, but they have new extra properties: isSmallAndColourful,canMakeJoke,isLargeAndGrey,canEatOtherFish
  - Dolphin is not a Fish, Dolphin is extended from Animal, Dolphin class have fish property and swim method is route to swim of Fish class
  - Caterpillar is animal then it is extended from Animal class, **boolean canfly** is set to false by default say that it cannot fly
  - Butterfly is extended from Caterpillar, but it can fly then **boolean canfly** is set to true in contructor
  - countAnimals this method to count animal by action they can do like swim, fly walk. Base on **instanceof** key word to determine which object is belong to which classes
  
2. **InternationalRooster** is extended from Rooster class, allow rooster can sing in different language. **void sing(String language)** is new method suppor rooster can sing by input language

Source code stored in **src/test** folder includes 2 classes
  - SolutionTest class contains all the test for Solution
  - InternationalRoosterTest contains all the test for InternationalRooster

