# More OOP

Sample project for Lab More OOP at the Object-oriented programming course at Ukrainian Catholic University.

## Continuous Integration

The workflow is `ci.yaml` file in the `.github/workflows` directory of this repository.

This workflow performs the following steps:

1. The `checkout` step downloads a copy of your repository on the runner.
1. The `setup-java` step configures the Java 11 JDK by Adoptium.
1. The "Build with Maven" step runs the Maven package target in non-interactive mode to ensure that your code builds, tests pass, and a package can be created.

## Task
Implement the heroes game in text mode
- class Character 
  - attributes: int power, in hp
  - methods: void kick(Character c), boolean isAlive()
- class Hobbit 
  - attributes: int power=0, int hp=3
  - methods: void kick(Character c) { toCry() }
- class Elf 
   - attributes: int power=10, int hp=10
   - methods: void kick(Character c) { kill everybody weaker than him, otherwise decrease the power of character by 1 }
- class King 
   - attributes: int power=from 5 to 15, int hp=from 5 to 15 
   - methods: void kick(Character c) { decrease number of hp of the enemy by random number which will be in the range of his power }
- class Knight 
   - attributes: int power=from 2 to 12, int hp=from 2 to 12
   - methods: void kick(Character c) { like King }
- class CharacterFactory 
   - methods: Character createCharacter() { returns random instance of any existing character } 
- class GameManager
   - methods: void fight(Character c1, Character c2) { to provide fight between to characters and explain via command line what happens during fight, till both of the characters are alive }
 
## Solution
- all classes implemented in different programs
- GameManager runs automaticaly
